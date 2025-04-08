package exercicios;

import java.util.Scanner;

public class Ex03 {
	
	//(03) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 
	//contendo números inteiros. Ao final do algoritmo, o vetor B 
	//deve conter o fatorial de cada elemento do vetor A.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		int fatorial= 1;
		int multiplicando;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Digite o " + (i+1) + "º valor: ");
			a[i] = scan.nextInt();
			
			fatorial=a[i];
			multiplicando=a[i];
			
			for(int j=0; j<(a[i]-1); j++) {
				fatorial=fatorial*(--multiplicando);
			}
			b[i]=fatorial;	
		}
		
		
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i]);
			
		}
		
	}

}
