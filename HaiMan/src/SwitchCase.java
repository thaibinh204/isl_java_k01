import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Nhap vao so nguyen:");
		Scanner myObj = new Scanner(System.in); // Create a Scanner Object
		int num = myObj.nextInt(); // trả về kiểu về int
		myObj.close();
		switch (num) {
			case 1:
				System.out.println("Chu Nhat");
				break;
			case 2:
				System.out.println("Thu 2");
				break;
			case 3:
				System.out.println("Thu 3");
				break;
			case 4:
				System.out.println("Thu 4");
				break;
			case 5:
				System.out.println("Thu 5");
				break;
			case 6:
				System.out.println("Thu 6");
				break;
			case 7:
				System.out.println("Thu7");
				break;
			default:
				System.out.println("Ban da nhap sai");
		}	
	}

}
