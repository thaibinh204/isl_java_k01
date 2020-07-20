import java.util.Scanner;

public class DaoNguoc {
	public static void main(String[] args) {
		System.out.println("Nhap vao so nguyen:");
		Scanner myObj = new Scanner(System.in); // Create a Scanner Object
		int num = myObj.nextInt(); // Ép kiểu về int
		myObj.close();
		System.out.println("So nguyen la: " + num);
		int reverseNum = 0;
		int temp = 0;
		while (num > 0) {
			temp = num % 10;
			reverseNum = reverseNum * 10 + temp;
			num = num / 10;
		}
		System.out.println("So dao nguoc la " + reverseNum);
	}
}
