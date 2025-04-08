package exercicios;

import java.util.Scanner;

public class Ex10 {
	
	//(10) Escreva um algoritmo para receber um vetor A de tamanho 10 
	//contendo números inteiros. O algoritmo deve gerar um vetor B e o 
	//popular com os números primos do vetor A.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		boolean ehPrimo =true;
		
		int q=0;
		
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
			
			for(int j=2; j<(a[i]-1); j++) {
				if(a[i]%j==0) {
					ehPrimo=false;
					break;
				}
			}
			if(ehPrimo==true) {
				q++;
			}
			ehPrimo=true;
		}
		System.out.println(q);

	}

}
