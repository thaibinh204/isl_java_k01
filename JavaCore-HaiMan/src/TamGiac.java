import java.util.Scanner;
public class TamGiac {
	public static void main (String [] args) {
		Scanner myOjb = new Scanner(System.in);
		System.out.println("Hay nhap canh a: ");
		float a = myOjb.nextFloat();
		System.out.println("Hay nhap canh b: ");
		float b = myOjb.nextFloat();
		System.out.println("Hay nhap canh c: ");
		float c = myOjb.nextFloat();
		myOjb.close();
		
		float S = a*b*c;
		float C = a+b+c;
		System.out.println("Dien tich tam giac la: " + S);
		System.out.println("Chu vi tam giac la: " + C);
	}
}
