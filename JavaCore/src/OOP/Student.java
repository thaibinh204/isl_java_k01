package OOP;

import java.time.LocalDate;
import java.util.Date;

public class Student {
	private String studentCd;
	private String name;
	private int age;
	private Date birthday;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getStudentCd() {
		return studentCd;
	}

	public void setStudentCd(String studentCd) {
		this.studentCd = studentCd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
		
		LocalDate lcBirthday = LocalDate.of(birthday.getYear() + 1900, birthday.getMonth()+1, birthday.getDate());
        LocalDate now = LocalDate.now();
        this.age = Utils.getDiffYears(lcBirthday, now);
	}
	
	public String toString() {
		return "Student Name is :" + this.name;
	}
}
