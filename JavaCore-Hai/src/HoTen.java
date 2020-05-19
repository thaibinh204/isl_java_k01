import java.util.Scanner;

public class HoTen {
	public static void main(String[] args) {
		System.out.println("Student Input:");
		Scanner student = new Scanner(System.in);
		String name = student.next();
		student.close();
		System.out.println("Ho ten sinh vien la: ");
		String name2 = name.toLowerCase();
		if (name2 == "nguyen") {
			System.out.println("Ban sinh vien co ho la Nguyen");
		} else {
			System.out.println("Ban sinh vien khong phai ho Nguyen");
		}
	}
}
