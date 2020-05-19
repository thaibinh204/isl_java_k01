import java.util.Scanner;

public class IFStatements {
	public static void main(String[] args) {
		/*
		int age = 40;
		
		if(age < 18) {
			System.out.println("Tre vi thanh nien");
		} else if (age >= 18 && age <= 40) {
			System.out.println("Nguoi thanh nien");
		} else {
			System.out.println("Nguoi trung nien");
		}
		*/
		/*
		System.out.println("Nhap vao diem thi cua ban:");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner objec
		double diem = myObj.nextDouble();
		myObj.close();
		
		//System.out.println(diem);
		// <4 kem
		// >=4 va <5 yeu
		// >=5 va <7 TB
		// >=7 va <8 Kha
		// >=8 va <9 gioi
		// >=9 SX
		if(diem <4) {
			System.out.println("Kem");
		} else if(diem >= 4 && diem < 5) {
			System.out.println("yeu");
		} else if(diem >= 5 && diem < 7) {
			System.out.println("TB");
		} else if(diem >= 7 && diem < 8) {
			System.out.println("Kha");
		} else if(diem >= 8 && diem < 9) {
			System.out.println("Gioi");
		} else {
			System.out.println("SX");
		}
		*/
		int total = 290;
		int feeShip = 20;
		int payTotal = 0;
		
		/*
		if(total >= 300) {
			payTotal = total;
		} else {
			payTotal = total + feeShip;
		}
		*/
		payTotal = (total >= 300) ? total : (total + feeShip);
		
		System.out.println("payTotal:" + payTotal);
		
	}
}
