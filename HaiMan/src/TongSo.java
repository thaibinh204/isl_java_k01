import java.util.Scanner;

public class TongSo{
	public static void main(String[] args) {
		System.out.println("Nhap so:");
		Scanner myOjb = new Scanner(System.in);
		int num = myOjb.nextInt();
		myOjb.close();
		System.out.println("So vua nhap la: " + num);
		int sodu;
		int sum = 0;
		while(num > 0) {
			sodu = num %10;
			sum += sodu;
			num = num /10;
		}
		System.out.println("Tổng các chữ số = " + sum);

	}
}
