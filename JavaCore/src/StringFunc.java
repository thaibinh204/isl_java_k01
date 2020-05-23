
public class StringFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Tran Ngoc Thai Binh";
		
		System.out.println("Ten ban co " + name.length() +" ky tu");
		System.out.println("Ten chu hoa: " + name.toUpperCase());
		System.out.println("Ten chu thuong: " + name.toLowerCase());
		
		String nmLw = name.toLowerCase();
		System.out.println(nmLw.indexOf("thai"));
		
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.err.println(txt);
		
		String path = "C:\\eclipse";
		System.err.println(path);
	}

}
