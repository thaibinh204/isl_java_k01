import java.util.Scanner;

public class IfStatements {
	public static void main(String[] args) {
//		System.out.println("Nhap vao diem thi cua ban:");
//		Scanner myObj = new Scanner(System.in); // Create a Scanner objec
//		double diem = myObj.nextDouble(); //Ép kiểu về double
//		myObj.close();
//
//		System.out.println(diem);
//		if (diem < 4) {
//			System.out.println("Kem"); // <4 kem
//		} else if (diem >= 4 && diem < 5) {
//			System.out.println("Yeu"); // >=4 va <5 yeu
//		} else if (diem >= 5 && diem < 7) {
//			System.out.println("TB"); // >=5 va <7 TB
//		} else if (diem >= 7 && diem < 8) {
//			System.out.println("Kha"); // >=7 va <8 Kha
//		} else if (diem >= 8 && diem < 9) {
//			System.out.println("Gioi"); // >=8 va <9 gioi
//		} else if (diem >= 9) {
//			System.out.println("SX"); // >=9 SX
//		}
		
		System.out.println("Nhap ma vung cua ban:");
		Scanner myObj = new Scanner(System.in); // Create a Scanner objec
		int phone = myObj.nextInt(); //Ép kiểu về double
		myObj.close();
		System.out.println("Ma vung cua ban la: ");
		String result = (phone == 81) ? "Japan" : "Nuoc khac";
		System.out.println(result);
	}	
}
