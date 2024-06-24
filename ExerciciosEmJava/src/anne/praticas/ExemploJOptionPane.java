package anne.praticas;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");

		JOptionPane.showMessageDialog(null, nome);
		
		
		String numeroUmTxt = JOptionPane.showInputDialog("Soma de dois numeros\nDigite um numero: ");
		
		int numeroUm = Integer.valueOf(numeroUmTxt);

		String numeroDoisTxt = JOptionPane.showInputDialog("Digite outro numero: ");
		
		int numeroDois = Integer.valueOf(numeroDoisTxt);
		
		int soma = somaDoisInteiros(numeroUm,numeroDois);
		
		JOptionPane.showMessageDialog(null, soma);
		
		
		int opcao = JOptionPane.showConfirmDialog(null, "Gostaria de ver novamente?");
		
		if(opcao == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, soma);
		}
		else if(opcao == JOptionPane.NO_OPTION) {
		}
	}
	
	public static int somaDoisInteiros(int numeroUm, int numeroDois) {
		
		int soma = numeroUm + numeroDois;
		
		return soma;
		
	}


}
