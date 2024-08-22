package anne.praticas.leetcode;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i=5;
		
		String txt = scan.nextLine();
		if(txt=="I") {
			i = Integer.valueOf(txt);
		}
		System.out.println("Numero: " + i);

	}

}
