import java.util.Scanner;

public class SoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so");
		String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        
        boolean nguyenTo = true;
        for(int i = 2; i < num; i++) {
        	if(num % i == 0) {
        		nguyenTo = false;
        		System.out.println("khong la so nguyen to");
        	}
        }
        if(nguyenTo) {
        	System.out.println("la so nguyen to");
        }
		
		

	}

}
