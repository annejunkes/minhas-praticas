package exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((a < (b + c)) && (b <(c+a)) && (c<(b+a))) {
			System.out.println("Formam um triangulo");
			
		} else {
			
				System.out.println("Não formam um triangulo");
			
		}

	}

}
