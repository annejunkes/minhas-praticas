package anne.praticas;

import javax.swing.JOptionPane;

public class Recursividade {

	public static void main(String[] args) {
		
		String n1Txt = JOptionPane.showInputDialog("Multiplicação de dois numeros\n"
				+ "Digite um número: ",null);
		
		int n1 = Integer.valueOf(n1Txt);
		
		String n2Txt = JOptionPane.showInputDialog("Digite outro número: ",null);
		
		int n2 = Integer.valueOf(n2Txt);

		JOptionPane.showMessageDialog(null,n1 + " x " + n2 + " = " + multiplica(n1,n2));
	}
	
	public static int multiplica(int n1, int n2) {
		
		if(n1==0 || n2==0) {
			return 0;
		}
		return n1+ multiplica(n1,n2-1);
	}

}
