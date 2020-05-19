import java.util.Scanner;

public class ChuViDienTichTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao canh thu nhat cua tam giac");
		float x = Float.parseFloat(scanner.nextLine());
		System.out.println("nhap vao canh thu 2 cua tam giac");
		float y = Float.parseFloat(scanner.nextLine());
		System.out.println("nhap vao canh thu 3 cua tam giac");
		float z = Float.parseFloat(scanner.nextLine());
		 
		float cv = x + y + z;
		float areas = (float)cv/2 * (cv - x) * (cv - y) * (cv - z);
		float s = (float)Math.sqrt(areas);
		System.out.println("chu vi tam giac la: " + cv);
		System.out.println("dien tich tam giac la: " + s);
		
		

	}

}
