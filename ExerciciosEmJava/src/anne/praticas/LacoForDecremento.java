package anne.praticas;

import java.util.Scanner;

public class LacoForDecremento {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] vetor = new String[5];
		
		System.out.println("Digite 5 palavras:");
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = scan.nextLine();			
		}
		
		System.out.println("Ordem inversa:");
		for(int i=vetor.length-1; i>=0; i--) {
			System.out.println(vetor[i]);		
		}
		

	}

}
