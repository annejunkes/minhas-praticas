package exercicios;

import java.util.Scanner;

public class Ex19 {
	
//(19) Escreva um algoritmo para receber uma matriz A(6,6) e um valor B. 
//O algoritmo deve multiplicar cada elemento de A por B e armazenar em um 
//vetor C.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor para B:");
		int b = scan.nextInt();
		
		int a[][] = new int[6][6];
		int c[][] = new int[6][6];

		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.println("Digite um valor para A(" + i + ", " + j + "):");
				a[i][j] = scan.nextInt();
				
				c[i][j] = a[i][j]*b;
	
			}
		}
		
		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.println("C[" + i + "][" + j + "] = " + c[i][j]);
				
	
			}
		}
	}

}
