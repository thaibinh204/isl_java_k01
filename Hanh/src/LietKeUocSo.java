import java.util.Scanner;

public class LietKeUocSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so nguyen");
		int num = Integer.parseInt(scanner.nextLine());
		for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.println(i);

	     }
	   }
	}
}
