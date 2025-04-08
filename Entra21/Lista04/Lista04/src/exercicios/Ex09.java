package exercicios;

import java.util.Scanner;

public class Ex09 {
	
	//(09) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 
	//contendo números inteiros. Ao final do algoritmo, um vetor C deve ser 
	//criado contendo a união de A e B em ordem decrescente.

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int a[] = new int[4];
		int b[] = new int [4];
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Insira o " + (i+1) + "º valor de A: ");
			a[i]=scan.nextInt();
			
			System.out.println("Insira o " + (i+1) + "º valor de B: ");
			b[i]=scan.nextInt();
			
		}

	}

}
