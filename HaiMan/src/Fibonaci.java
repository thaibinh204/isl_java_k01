import java.util.Scanner;

public class Fibonaci {
	
	int fibonaci(int n){
		  if(n == 1 || n ==2)return 1;
		  return fibonaci(n-1) + fibonaci(n-2);
		 }
	
	public static void main(String[] args) {
		System.out.print("Hay nhap so can tim: ");
		Scanner myojb = new Scanner(System.in);
		int num = myojb.nextInt();
		myojb.close();
		System.out.println("So vua nhap: " + num);

//		int F0 = 1;
//		int F1 = 1;
//		int Fn = F0 + F1;
//		if (num < 0) {
//			System.out.print("Wrong");
//		} else if (num == 0 || num == 1) {
//			System.out.println("So fibonaci la: " + num);
//		} else {
//			for (int i = 3; i <= num; i++) {
//				Fn = F0 + F1;
//				F0 = F1;
//				F1 = Fn;
//				System.out.println("Vong lap " + i);
//				System.out.println("So F0: " + F0);
//				System.out.println("So F1: " + F1);
//				System.out.println("So Fn : " + Fn);
//				System.out.println("--------");
//			}
//			System.out.print("So fibonaci la : " + Fn);
//		}
		Fibonaci find = new Fibonaci();
		System.out.println("so fibonaci thu n: " + num +" la : " +find.fibonaci(num));
	}
}
