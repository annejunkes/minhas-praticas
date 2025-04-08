package exercicios;

import java.util.Scanner;

public class Ex15 {
	
	//(15) Escreva um algoritmo para receber uma matriz A(5,5) 
	//contendo números inteiros e imprimir o menor elemento da 
	//sua diagonal principal.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int a[][] = new int[5][5];
		int menor=Integer.MAX_VALUE;
		
		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.println("Digite um valor para A(" + i + ", " + j + "):");
				a[i][j] = scan.nextInt();
				
				if(i==j) {

					if(a[i][j]<menor) {
						menor=a[i][j];
					}
				}
			}
		}
		System.out.println("O menor valor da diagonal principal é " + menor);

	}

}
