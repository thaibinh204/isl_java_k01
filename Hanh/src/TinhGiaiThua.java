import java.util.Scanner;

public class TinhGiaiThua {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("nhap n");
	int num = Integer.parseInt(scanner.nextLine());
	
	 if(num == 0 || num == 1) {
		 System.out.println("giai thua la 1" );
	 }
	 else {
		 int gt = 2;
		 for(int i = 2; i <= num ; i++);
		 
		  gt *= i ;
		 System.out.println("giai thua la " + gt);
		
	}
}
}
