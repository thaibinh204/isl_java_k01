import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("Nhap vao 10 phan tu cho mang");
		// Mo listen tu ban phim
		Scanner scanner = new Scanner(System.in);
		//
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Phan tu thu " + (i+1) + ": ");
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		//Xuat phan tu trong mang ra
		System.out.println("Mang co cac phan tu sau:");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		System.out.println("Phan tu thu 10 cua mang: " + arr[9]);
	}

}
