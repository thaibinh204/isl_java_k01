import java.util.Scanner;

public class UclnBcnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.println("nhap b");
		int b = Integer.parseInt(scanner.nextLine());
		
			if(a == 0 || b ==0 ) {
				System.out.println("bcnn cua " + a + "va " + b + "la 0");
			}
			else {
				for(int i = Math.max(a, b); i <= a*b; i++) {
					if(i % a == 0 & i % b == 0) {
						int bc = i;
						int uc = a * b / bc;
						System.out.println("bcnn cua " + a + "va " + b + " la: " + bc );
						System.out.println("ucln cua " + a + " va " + b + "la: " + uc );
						break;
					}
				
				}
					
			}
			
	}
}
	
