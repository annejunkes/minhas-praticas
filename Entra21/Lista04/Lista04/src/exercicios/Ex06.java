package exercicios;

import java.util.Scanner;

public class Ex06 {
	
	//(06) Escreva um algoritmo para receber um vetor A de tamanho 15 
	//contendo números inteiros e imprimir a quantidade de valores pares.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[15];
		int q = 0;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Digite o " +(i+1) + "º valor de A: ");
			a[i] = scan.nextInt();
			
			if(a[i]%2==0) {
				q++;
			}
		}
		System.out.println("Quantidade de pares: " + q);

	}

}
