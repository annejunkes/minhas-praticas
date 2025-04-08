package exercicios;

import java.util.Scanner;

public class Ex08 {
	
	//(08) Escreva um algoritmo para receber um vetor A de tamanho 20 de 
	//contendo números inteiros e ordená-lo em ordem crescente.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int a[] = new int[20];
		int aux = 0;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Insira o " + (i+1) + "º valor de A: ");
			a[i]=scan.nextInt();
			
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					aux = a[i]; 
					a[i]=a[j]; 
					a[j]=aux; 
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
