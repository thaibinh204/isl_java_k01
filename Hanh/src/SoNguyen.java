import java.util.Scanner;

public class SoNguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Nhap so nguyen");
		Scanner myObj = new Scanner(System.in);  
		// Create a Scanner objec
		int num = myObj.nextInt();
		myObj.close();
		if(num%2==0) {
			System.out.println("so chan");
		}
			else {
				System.out.println("sole");
				
		}

	}

}*/
        System.out.println("Nhap ban kinh hinh tron");
		Scanner scanner = new Scanner(System.in);  
		// Create a Scanner objec
		double num = scanner.nextDouble();
		scanner.close();
		//System.out.println(num);
		final double pi = 3.14;
		double cv = 2 * num * pi;
		double s = num* num* pi;
		System.out.println(cv);
		System.out.println(s);
		
	}
}
		
		
		
