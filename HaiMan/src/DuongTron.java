import java.util.Scanner;

public class DuongTron {
	public static void main(String[] args) {
		System.out.println("Nhap ban kinh duong tron:");
		Scanner myObj = new Scanner(System.in); // Create a Scanner Object
		float bk = myObj.nextFloat(); // Trả về kiểu dữ liệu float
		myObj.close();
		final float pi = 3.14F;
		float dientich = bk * pi * pi;
		float chuvi = bk * 2 * pi;
		System.out.println("Dien tich hinh tron:" + dientich);
		System.out.println("Chu vi hinh tron tron:" + chuvi);
	}
}
