package exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
				
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a%b==0 || b%a==0) {
			System.out.println(a + " e " + b + " são múltiplos entre si");
			
		}
		else {
			System.out.println(a + " e " + b + " não são múltiplos entre si");
		}

	}

}
