package exercicios;

import java.util.Scanner;

public class Ex17 {
	
	//(17) Escreva um algoritmo para receber duas matrizes A(4,4) e B(4,4) 
	//e retornar a matriz C que seja a soma de A com B.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[][] = new int[4][4];
		int b[][] = new int[4][4];
		int c[][] = new int[4][4];
		
		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.println("Digite um valor para A(" + i + ", " + j + "):");
				a[i][j] = scan.nextInt();
				
				System.out.println("Digite um valor para B(" + i + ", " + j + "):");
				b[i][j] = scan.nextInt();
				
			}
		}
		

		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
				
			}
		}

	}

}
