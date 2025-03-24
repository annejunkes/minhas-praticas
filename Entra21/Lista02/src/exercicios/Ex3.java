package exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numero = scan.nextInt();
		
		if(numero%2==0) {
			System.out.println("par");
		}
		else {
			System.out.println("ímpar");
		}
		if(numero>=0) {
			System.out.println("positivo");
		}
		else {
			System.out.println("negativo");
		}

	}

}
