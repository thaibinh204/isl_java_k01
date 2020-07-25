package com.example.thymeleafdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.thymeleafdemo.form.PersonForm;
import com.example.thymeleafdemo.model.Person;
import com.example.thymeleafdemo.service.PersonService;
//import com.example.thymeleafdemo.service.PersonService;
import com.example.thymeleafdemo.validator.PersonValidator;

@Controller
public class MainController {

	@Autowired
	private PersonService personService;

	@Autowired
	private PersonValidator personValidator;

	@Value("${welcome.message}")
	private String message;
	@Value("${error.message}")
	private String errorMessage;

	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public String index(Model model) {

		Person person1 = new Person();
		person1.setFirstName("Hai");
		person1.setLastName("Nguyen");
//		personService.save(person1);
		model.addAttribute("message", message);

		return "index";
	}

	@RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
	public String personList(Model model) {

		// ****************************************
		// tra ve toan bo record cua bang
		// List<Person> list = personService.findAll();
		// ****************************************

		// ****************************************
		// tim kiem bang id
		// Person person1 = personService.findById(Long.valueOf(3));
		// List<Person> list = new ArrayList<Person>();
		// list.add(person1);
		// ****************************************

		// ****************************************
		// Custom delete sql
		// personService.deleteByFirstName("abc", "def");
		// *****************************************

		// ****************************************
		// Custom select sql
		// List<Person> list = personService.selectByLastName("Nguyen2");

		// *****************************************

		// ****************************************
		// custom update sql
		// personService.updateNameById(Long.valueOf(8), "abc", "def");

		// ****************************************
		List<Person> list = personService.findAll();

		model.addAttribute("persons", list);

		return "personList";
	}

	@RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
	public String showAddPersonPage(Model model) {

		PersonForm personForm = new PersonForm();
		model.addAttribute("personForm", personForm);

		return "addPerson";
	}

	@RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
	public String savePerson(@ModelAttribute("personForm") Person personForm, BindingResult bindingResult) {
		personValidator.validate(personForm, bindingResult);
		if (bindingResult.hasErrors()) {
			return "addPerson";
		}

//		String firstName = personForm.getFirstName();
//		String lastName = personForm.getLastName();

//		if (firstName != null && firstName.length() > 0 //
//				&& lastName != null && lastName.length() > 0) {
//			//add vao person list da khai bao phia trenÚ
//			Person newPerson = new Person(firstName, lastName);
//			persons.add(newPerson);
//
//			return "redirect:/personList";
//		} else {
//			model.addAttribute("errorMessage", errorMessage);
//			return "addPerson";
//		}

		personService.save(personForm);
		return "redirect:/personList";

	}

}
