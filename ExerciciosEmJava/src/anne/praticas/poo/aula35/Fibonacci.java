package anne.praticas.poo.aula35;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		
		int escolha = JOptionPane.showConfirmDialog(null,"Deseja ver a sequencia fibonacci?\nDigite s(sim) ou n(não):");

		
		if(escolha == JOptionPane.YES_OPTION) {
			System.out.println("Sequencia fibonacci(10 termos):");
			for(int i=0; i<10; i++) {
			JOptionPane.showMessageDialog(null, i+1 + "º termo: " + fibonacci(i));
			}
		}
		else if(escolha == JOptionPane.NO_OPTION) {
		}

	}
	public static int fibonacci(int num) {
		
		if(num<2) {
			return 1;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}

}
