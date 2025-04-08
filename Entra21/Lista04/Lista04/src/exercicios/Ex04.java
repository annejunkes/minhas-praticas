package exercicios;

import java.util.Scanner;

public class Ex04 {
	
	//(04) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 
	//contendo números inteiros. Ao final do algoritmo,
	//um vetor C deve ser criado contendo a união de A e B.
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[][] c = new int[2][10];
		
		for(int i=0; i<a.length; i++) {
			
		System.out.println("Digite o " + (i+1) + "º valor de A: ");
		a[i] = scan.nextInt();
		
		System.out.println("Digite o " + (i+1) + "º valor de B: ");
		b[i] = scan.nextInt();

		}
		
		for(int i=0; i<c.length; i++) {
			
			for(int j=0; j<c[i].length; j++) {
				c[0][j]=a[j];
				c[1][j]=b[j];
				System.out.println(c[i][j]);
			}
		}
		
	}

}
