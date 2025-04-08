package exercicios;

import java.util.Scanner;

public class Ex20 {
	
	//(20) Escreva um algoritmo para receber uma matriz A(12,12). O algoritmo 
	//deve somar cada linha de A e armazenar em um vetor B.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a[][] = new int[3][4];
		int b[] = new int[3];

		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.println("Digite um valor para A(" + i + ", " + j + "):");
				a[i][j] = scan.nextInt();
				
				b[i]+=a[i][j];
	
			}
		}
		

		for(int i =0; i<b.length; i++) {
			
				System.out.println(b[i]);
	
			}

	}

}
