import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RutGon {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhao tu so");
		int tu = Integer.parseInt(scanner.nextLine());
		System.out.println("nhap mau so");
		int mau = Integer.parseInt(scanner.nextLine());

		List<Integer> tuSo = getDividable(tu);
		List<Integer> mauSo = getDividable(mau);
		
		for(Integer num: tuSo){
		if(mauSo.contains(num)){
		tu = tu / num;
		mau = mau / num;
		break;
		}
		}
		StringBuilder builder = new StringBuilder();
		builder.append("rut gon ");
		builder.append(tuSo + "/" + mauSo);
		builder.append(" ra ket qua la :");
		builder.append( tu + "/" + mau );
		System.out.println(builder.toString());
		}
		private static List<Integer> getDividable(int num){
		List<Integer> rutGon = new ArrayList();
		for(int i = num; i >= 2; i-- ){
		if(num % i == 0){
		rutGon.add(i);
		}
		}
		return rutGon;
		}
		}
