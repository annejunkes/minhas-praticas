package exercicios;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor inteiro para descobrir seu fatorial: ");		
		int valor = scan.nextInt();
		
		int multiplicando = valor;
		int fatorial = valor;
		
		for(int i = 0; multiplicando>1 ; i++) {
			fatorial *= --multiplicando;
			//fatorial = fatorial*(--multiplicando);
		}
		
		System.out.println(valor + "! = " + fatorial);

	}

}
