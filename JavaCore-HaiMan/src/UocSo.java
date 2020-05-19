import java.util.Scanner;

public class UocSo {
	public static void main(String[] args) {
		Scanner myOjb = new Scanner(System.in);
		System.out.println("Hay nhap so: ");
		int num = myOjb.nextInt();
		myOjb.close();
		System.out.println("Cac uoc so cua " + num + " la: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
