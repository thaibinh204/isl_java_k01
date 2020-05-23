package OOP;

import java.time.LocalDate;
import java.time.Period;

public class Utils {
	public static int getDiffYears(LocalDate first, LocalDate last) {
		//LocalDate pdate = LocalDate.of(2012, 01, 01);
        //LocalDate now = LocalDate.now();
 
        Period diff = Period.between(first, last);
	    return diff.getYears();
	}
	
}
