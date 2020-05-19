import java.util.Scanner;

public class StringSum {
	public static void main(String[] args) {
		System.out.println("Nhap chuoi:");
		Scanner myOjb = new Scanner(System.in);
		String para = myOjb.next();
		myOjb.close();
		System.out.println("Chuoi vua nhap la: " + para);
		int sum = 0;
		for(int i = 0; i < para.length(); i++) {
			sum++;
		}
		System.out.println("Do dai cua chuoi la: " + sum);
	}

}
