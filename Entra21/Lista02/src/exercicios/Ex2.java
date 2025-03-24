package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int maior =0;
		
		if(num1>num2 && num1>num3) {
			System.out.println("Maior = " + num1);
		}
		else {
			if(num2>num3) {
				System.out.println("Maior = " + num2);
			}
			else {
				System.out.println("Maior = " + num3);
			}
		}
		
	}

}
