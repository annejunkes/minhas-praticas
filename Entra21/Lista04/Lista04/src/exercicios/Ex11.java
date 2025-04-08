package exercicios;

import java.util.Scanner;

public class Ex11 {
	
	//(11) Escreva um algoritmo para receber um vetor A de tamanho 15 contendo 
	//números inteiros e imprimir o maior valor do vetor.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[]a = new int[15];
		int maior = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Digite o  " + (i+1) + "º valor de A:");
			a[i]=scan.nextInt();
			if(a[i]>maior) {
				maior=a[i];
				
			}
		}
		System.out.println("O maior número é " + maior);

	}

}
