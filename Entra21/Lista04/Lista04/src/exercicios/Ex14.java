package exercicios;

import java.util.Scanner;

public class Ex14 {
	
	//(14) Escreva um algoritmo para receber uma matriz A(5,5) contendo números 
	//inteiros e imprimir a soma dos elementos da linha 5 e da coluna 3.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int a[][] = new int[5][5];
		int soma=0;
		
		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.println("Digite um valor para A(" + i + ", " + j + "):");
				a[i][j] = scan.nextInt();
				
				if(i==4 || j==2) {
				soma+=a[i][j];
				}
			}
		}
		System.out.println("A soma dos elementos da coluna 3 e da linha 5 é " + soma);

	}

}
