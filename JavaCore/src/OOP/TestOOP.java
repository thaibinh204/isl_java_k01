package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestOOP {

	public TestOOP() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		Student student = new Student();
		student.setStudentCd("DHTH02-001");
		student.setName("Tran Ngoc Thai Binh");
		student.setBirthday(formatter.parse("1983-1-25"));
		//student.setAge(18);
		
		System.out.println(student.getName());
		System.out.println("Birthday is :" + formatter.format(student.getBirthday()));		
		System.out.println(student.getAge() + " years old");
		
	}

}
