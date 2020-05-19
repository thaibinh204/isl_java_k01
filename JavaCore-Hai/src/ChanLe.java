import java.util.Scanner; // Thư viện để Sacaner

public class ChanLe {
	public static void main(String[] args) {
		System.out.println("Nhap vao so nguyen:");
		Scanner myObj = new Scanner(System.in); // Create a Scanner Object
		int num = myObj.nextInt(); // trả về kiểu về int
		myObj.close();
		System.out.println("So nguyen la: " + num);
		if (num % 2 == 0) {
			System.out.println(num + " la so chan");
		} else {
			System.out.println(num + " la so le");
		}
	}
}
