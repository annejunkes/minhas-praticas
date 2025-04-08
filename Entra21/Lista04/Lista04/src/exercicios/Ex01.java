package exercicios;

import java.util.Scanner;

public class Ex01 {
	
	//(01) Escreva um algoritmo para criar e popular um vetor com os 100 primeiros números pares.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int pares[] = new int[100];
		int j=0;
		
		for(int i=0; i<pares.length; i++) {
			j+=2;
			pares[i]=j;
				
			}
			
		for(int i=0; i<pares.length; i++) {
			System.out.println(pares[i]);
		}

	}

}
