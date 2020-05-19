import java.util.Scanner;

public class UCLN_BCNN {
	public static void main(String[] args) {
		Scanner myOjb = new Scanner(System.in);
		System.out.println("Hay nhap so thu 1: ");
		int num1 = myOjb.nextInt();
		System.out.println("Hay nhap so thu 2: ");
		int num2 = myOjb.nextInt();
		myOjb.close();
		System.out.println("Uoc so chung lon nhat cua 2 so la: ");
		for(int j = (num1+num2); j >= 1; j--) {
			if(num1%j== 0 && num2%j ==0) {
				System.out.println(j);
			}
		}
		System.out.println("Boi so chung nho nhat cua 2 so la: ");
		for(int i = 1; i<= (num1*num2); i++) {
			if(i%num1 == 0 && i%num2 ==0) {
				System.out.println(i);
			}
		}
		
	}
}
