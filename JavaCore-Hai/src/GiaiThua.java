import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
		System.out.println("Nhap vao so nguyen:");
		Scanner myObj = new Scanner(System.in); // Create a Scanner Object
		int num = myObj.nextInt(); // trả về kiểu về int
		myObj.close();
		int giaithua = 1;
		if (num == 0 || num == 1) {
			System.out.println("Giai thua cua" + num + " la: " + giaithua);
		} else {
			for (int i = 1; i <= num; i++) {
				giaithua *= i;
			}
			System.out.println("Giai thua cua" + num + " la: " + giaithua);
		}
	}
}
