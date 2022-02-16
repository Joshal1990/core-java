package others;

import java.util.*;

public class OracleQuestion6 {
	public static void main(String[] args) {
		String in = "1 a 10 . 100 1000";
		Scanner s = new Scanner(in);
		String accum = "";
		for (int x = 0; x < 4; x++) {
			accum = s.next(in);
		}
		System.out.println(accum);
	}
}
