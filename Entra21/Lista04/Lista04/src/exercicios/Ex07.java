package exercicios;

import java.util.Scanner;

public class Ex07 {
	
	//(07) Escreva um algoritmo para receber um vetor A de tamanho 20 
	//contendo números inteiros e imprimir a soma dos seus elementos.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[20];
		int soma=0;
		
		for(int i=0; i<a.length; i++) {
		System.out.println("Insira o " + (i+1) + "º valor de A: ");
		a[i] = scan.nextInt();
		soma+=a[i];

		}
		System.out.println("A soma dos elementos do vetor é " + soma);
	}

}
