package exercicios;

import java.util.Scanner;

public class Ex05 {
	
	//(04) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 
	//contendo números inteiros. Ao final do algoritmo, um vetor C deve ser 
	//criado contendo a intersecção de A e B.	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[3];
		int[] b = new int[3];

		int tamanhoC=0;
		int q=0;
		
		System.out.println("Digite 10 valores para A: ");
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("Digite 10 valores para A: ");
		for(int i=0; i<a.length; i++) {
			b[i] = scan.nextInt();
		}
		
		for(int i =0; i<a.length; i++) {
			q=0;
			for(int j=0; j<a.length; j++) {
				if(a[i]==b[j] && q==0) {
					q++;
					tamanhoC++;
					break;
				}
			}
		}
		
		int c[] = new int[tamanhoC];
		int posicao =0;
		for(int i =0; i<a.length; i++) {
			q=0;
			for(int j=0; j<a.length; j++) {
				if(a[i]==b[j] && q==0) {
					q++;
					c[posicao]=a[i];
					posicao++;
				}
			}
		}
		
		System.out.println(tamanhoC);
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}

	}

}
