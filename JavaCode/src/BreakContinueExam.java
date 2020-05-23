
public class BreakContinueExam {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			if (i == 4) {
//				break;
//			}
//			System.out.println(i);
//		}

//		for (int i = 0; i < 10; i++) {
//			if (i == 4) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		String[] clsK01 = {"Hanh","Phuong Anh","Son","Duc","Thi","Hai","The Anh","Binh"};
		
		System.out.println("================================");
		System.out.println("Tim ban \"Hai\" trong lop hoc clsK01");		
		// Tim ban "Hai" trong lop hoc clsK01
		for (String student : clsK01) {
			if(student == "Hai") {
				System.out.println(student);
				break;
			}			
		}
		
		System.out.println("================================");
		System.out.println("Xuat ra tat ca hoc vien trong lop clsK01 tru ban \"Thi\" ra");
		// Xuat ra tat ca hoc vien trong lop clsK01 tru ban "Thi" ra
		for (String student : clsK01) {
			if(student == "Thi") {
				continue;
			}			
			System.out.println(student);
		}
	}
}
