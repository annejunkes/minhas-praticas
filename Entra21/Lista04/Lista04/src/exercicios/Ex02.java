package exercicios;

public class Ex02 {
	
	//(02) Escreva um algoritmo para criar e popular um vetor com os 10 
	//primeiros números primos.
	//existe uma relação entre a quantidade de numeros primos achados e a 
	//posição em que eles devem estar no vetor
	
	public static void main(String[] args) {
		
		int primos[] = new int[10];
		
		boolean ehPrimo=true;
		
		int qtd=0;
	
		while(qtd<10) {
			
		for(int i = 1; qtd <primos.length; i++) {
			
			for(int j=2; j<(i-1); j++) {
				if(i%j==0) {
					ehPrimo = false;
					break;
				}
			}
			if(ehPrimo==true) {
				primos[qtd]=i;
				
				System.out.println(primos[qtd]);
				qtd++;
			}
			
			ehPrimo=true;
		}
		}
		
		

	}

}
