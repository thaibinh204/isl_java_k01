import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so nguyen");
	    int n = scanner.nextInt();
	    
	    int sum = 0;
	    while (n > 0) {
	       int soDu = n % 10;
	       n = n / 10;
	      sum += soDu;
	    }
	    
	    System.out.println("Tong = " + sum);
		
	}

}
