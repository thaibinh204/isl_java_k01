
public class Calculatoin {

	public Calculatoin() {
		// TODO Auto-generated constructor stub
	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
		
	public float plus(float a, float b) {
		return a + b;
	}
	
	public void sayHello() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatoin cal = new Calculatoin();
		int a = 25;
		int b = 35;
		
		cal.sayHello();
		//int c = cal.plus(a, b);
		int c = Calculatoin.plus(a, b);
		System.out.println(c);
		
		//Calculatoin cal = new Calculatoin();
		cal.sayHello();
		System.out.println(cal.plus(15.5F, 20.4F));
	}

}
