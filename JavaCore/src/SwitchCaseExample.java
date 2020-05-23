import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vui long nhap vao so cua ngay trong tuan");
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		scan.close();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("So nay khong phai trong tuan");
			break;
		}
	}

}
