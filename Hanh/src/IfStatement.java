import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int age = 20;
		if(age < 20) {
			System.out.println("tre vi thanh nien");
		}
		else if(age >= 20 && age <= 40) {
			System.out.println("thanh nien");
		}
		else {
			System.out.println("trung nien");
		}
		
		

	}

}
*/
	/*	System.out.println("Nhap vao diem thi cua ban:");
		Scanner myObj = new Scanner(System.in);  
		// Create a Scanner objec
		double diem = myObj.nextDouble();
		myObj.close();
		
		//System.out.println(diem);
		 if(diem < 4){
			 System.out.println("yeu");
		 }
			 else if(diem >= 4 && diem <5) {
				 System.out.println("yeu");
			 }
				 else if(diem >= 5 && diem < 7) {
					 System.out.println("trung binh");
				 }
					 else if(diem >=7 && diem < 8 ) {
						 System.out.println("kha");
					 }
					  else if(diem >= 8 && diem < 9) {
						  System.out.println("gioi");
					  }
		else {
			System.out.println("xuat sac");
		}
				 
		 }
}*/
		/*int total = 300;
		int feeShip = 20;
		int payTotal = total >= 300 ? total : (total + feeShip );
		//nếu >=300 thì free ship 
		//nếu nhỏ hơn 300 thì phải cộng thêm 20k ship
		System.out.println(payTotal);*/
		
		
		System.out.println("Nhap vao ma vung");
		Scanner myObj = new Scanner(System.in);  
		// Create a Scanner objec
		int maVung = myObj.nextInt();
		myObj.close();
		String result = (maVung == 81) ? "jp" : "nuoc khac";
		System.out.println(result);
		
		
	}
}