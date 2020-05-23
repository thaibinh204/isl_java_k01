package OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestOOP {

	public TestOOP() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStudentCd("DHTH02-001");
		student.setName("Tran Ngoc Thai Binh");
		student.setBirthday(new Date(1983, 1, 25));
		//student.setAge(18);
		
		System.out.println(student.getName());
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Birthday is :" + formatter.format(student.getBirthday()));
		
		System.out.println(student.getAge() + " years old");
		
	}

}
