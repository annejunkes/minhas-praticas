package anne.praticas;

import java.util.Scanner;

public class ParesImpares {
	
	public static void VerificaPares(int[] vetor){
		
		System.out.println("Pares:");
		
		for(int i=0; i<vetor.length;i++) {
			if(vetor[i]%2==0) {
				System.out.println(vetor[i]);
			}
			
		}
		
	}
	public static void VerificaImpares(int[] vetor) {
		
		System.out.println("Impares:");
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]%2!=0) {
				System.out.println(vetor[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[]vetor = new int[5];
		
		System.out.println("Digite 5 numeros inteiros:");
		for(int i=0; i<vetor.length;i++) {
			String vetorTxt = scan.nextLine();
			vetor[i] = Integer.valueOf(vetorTxt);
		}
		
		VerificaPares(vetor);
		VerificaImpares(vetor);

	}

}
