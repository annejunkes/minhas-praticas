package exercicios;

import java.util.Scanner;

public class Ex13 {
	
	/*(13) Escreva um algoritmo para ler um valor em reais e calcular 
	 * qual o menor número possível de notas de 100, 50, 10, 5, 2 e 1 
	 * em que o valor lido pode ser decomposto. Escrever o valor lido e 
	 * a relação de notas necessárias.
	 * Ex: 158
	 * 1 nota de 100
	 * 1 nota de 50
	 * 0 notas de 10
	 * 1 nota de 5
	 * 1 nota de 2
	 * 1 nota de 1
	 * 
*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira um valor em reais: ");
		float valor = scan.nextFloat();
		
		int notas100 = (int) (valor/100);
		
		int notas50 = (int) ((valor%100)/50);
		
		int notas10 = (int) ((valor%100)%50)/10;
		
		int notas5 = (int) (((valor%100)%50)%10)/5;
		
		int notas2 = (int) ((((valor%100)%50)%10)%5)/2;
		
		int notas1 = (int) ((((valor%100)%50)%10)%5)%2;
		
		System.out.println(notas100 + " notas de R$100,00");
		System.out.println(notas50 + " notas de R$50,00");
		System.out.println(notas10 + " notas de R$10,00");
		System.out.println(notas5 + " notas de R$5,00");
		System.out.println(notas2 + " notas de R$2,00");
		System.out.println(notas1 + " notas de R$1,00");

	}

}
