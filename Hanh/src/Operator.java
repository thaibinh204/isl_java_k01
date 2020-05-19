
public class Operator {
	public static void main(String[] args) {
		int x = 25;
		int y = 10;
		int z = 25;
		int sum1 = x + y;
		int sum2 = sum1 + z;
		int sum = sum1 + sum2;
		
		int a = x / y;
		//chia lay du
		 x++;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum);
		System.out.println(a);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x++);
	}

}
