import java.util.Scanner;

public class SoNguyenTo {
	public static void main(String[] args) {
		System.out.println("Nhap so:");
		Scanner myOjb = new Scanner(System.in);
		int num = myOjb.nextInt();
		myOjb.close();
		System.out.println("So vua nhap la: " + num);
		boolean flag = true;
		if(num < 2) {
			flag = false;
		}else if(num == 2){
			flag = true;
		}else {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num%i==0) {
					flag = false;
					break;
				}
			}
		}
		if(flag == true) {
			System.out.println(num + " la so nguyen to");
		}else {
			System.out.println(num + " khong phai sla so nguyen to");
		}
	}
}
