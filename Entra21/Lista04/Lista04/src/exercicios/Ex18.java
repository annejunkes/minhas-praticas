package exercicios;

import java.util.Scanner;

public class Ex18 {
	
	//(18) Escreva um algoritmo para receber uma matriz A(9,9) de reais e 
	//imprimir a soma dos elementos das linhas pares de A.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float a[][] = new float[2][2];
		float soma = 0;

		
		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.println("Digite um valor para A(" + i + ", " + j + "):");
				a[i][j] = scan.nextInt();
				
				if(i%2==0) {
					soma+=a[i][j];
				}
				
			}
		}
		System.out.println("Soma = " + soma);

	}

}
