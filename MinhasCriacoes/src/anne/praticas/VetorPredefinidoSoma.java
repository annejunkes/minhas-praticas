package anne.praticas;

public class VetorPredefinidoSoma {

	public static int SomaValoresVetor(int[] vetor) {
		int soma =0;
		for(int i=0; i<vetor.length; i++) {
			soma = soma+vetor[i];
		}
		return soma;

	}
	public static void main(String[] args) {
		
		int[] vetor = {1,2,3,4};
		int soma = SomaValoresVetor(vetor);
		System.out.println(soma);

	}

}
