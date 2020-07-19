package com.example.thymeleafdemo.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.thymeleafdemo.form.PersonForm;
import com.example.thymeleafdemo.form.StudentForm;
import com.example.thymeleafdemo.model.Student;
import com.example.thymeleafdemo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value = { "/studentList" }, method = RequestMethod.GET)
	public String listStudent(Model model,  @RequestParam(name = "message") String message) {
		List<Student> list = studentService.findAll();
		model.addAttribute("students", list);
		model.addAttribute("message", message);
		return "student_list";
	}

	@RequestMapping(value = { "/addStudent" }, method = RequestMethod.GET)
	public String showAddPersonPage(Model model) {

		StudentForm stForm = new StudentForm();
		model.addAttribute("studentForm", stForm);

		return "add_student";
	}

	@RequestMapping(value = { "/addStudent" }, method = RequestMethod.POST)
	public String savePerson(Model model, @ModelAttribute("studentForm") StudentForm studentForm)
			throws ParseException {

		Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(studentForm.getBirthday());
		Student student = new Student();
		student.setFullName(studentForm.getFullName());
		student.setBirthday(birthday);
		student.setMath(studentForm.getMath());
		student.setLiterature(studentForm.getLiterature());
		student.setEnglish(studentForm.getEnglish());

		studentService.save(student);

		return "redirect:/studentList?message=Add done";

	}

	@RequestMapping(value = { "/deleteStudent" }, method = RequestMethod.GET)
	public String deleteStudent(Model model, @RequestParam(name = "id") long id) {
		studentService.deleteByid(id);
		return "redirect:/studentList?message=Delete done";
	}

	@RequestMapping(value = { "/editStudent" }, method = RequestMethod.GET)
	public String showEditPage(Model model, @RequestParam(name = "id") long id) throws ParseException {
		Student student = studentService.findById(id);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String birthday = simpleDateFormat.format(student.getBirthday());

		StudentForm stForm = new StudentForm();
		stForm.setFullName(student.getFullName());
		stForm.setBirthday(birthday);
		stForm.setMath(student.getMath());
		stForm.setLiterature(student.getLiterature());
		stForm.setEnglish(student.getEnglish());
		System.out.println(birthday);

		model.addAttribute("studentForm", stForm);
		model.addAttribute("studentId", id);

		return "student-edit";
	}

	@RequestMapping(value = { "/editStudent" }, method = RequestMethod.POST)
	public String editStudent(Model model, @ModelAttribute("studentId") String id,
			@ModelAttribute("studentForm") StudentForm studentForm) throws ParseException {
		System.out.println("id: " + id);
		Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(studentForm.getBirthday());

		studentService.updatebyId(Long.valueOf(id), studentForm.getFullName(), birthday, studentForm.getMath(),
				studentForm.getLiterature(), studentForm.getEnglish());

		return "redirect:/studentList?message="+"Update done";

	}

	@RequestMapping(value = "/student-list/page/{page}")
	public ModelAndView listStudentPageByPage(@PathVariable("page") int page) {
		ModelAndView modelAndView = new ModelAndView("student-list-paging");
		PageRequest pageable = PageRequest.of(page - 1, 5);
		Page<Student> studentPage = studentService.findPaginated(pageable);
		int totalPages = studentPage.getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			modelAndView.addObject("pageNumbers", pageNumbers);
		}
		modelAndView.addObject("studentArticleList", true);
		modelAndView.addObject("studentList", studentPage.getContent());
		return modelAndView;
	}
}
