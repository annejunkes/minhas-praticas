package anne.praticas;

import java.util.Scanner;

public class MetodoComVetor {

	public static int RetornaMenorNumeroDoVetor(int[]vetor) {
		int menor=999999999;
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]<menor) {
				menor = vetor[i];
			}
		}
		System.out.println("Menor:" + menor);
		return menor;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = {0,2,3,-999};
		RetornaMenorNumeroDoVetor(vetor);
	}

}
