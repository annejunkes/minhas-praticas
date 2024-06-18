package anne.praticas;

import java.util.Scanner;

public class MetodoComRetorno {

	public static double CalculaMedia (double notaUm, double notaDois) {
		
		double media = (notaUm+notaDois)/2;
		System.out.println("Média:" + media);
		
		return media;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a nota 1 do aluno:");
		String notaUmtxt = scan.nextLine();
		double notaUm = Double.valueOf(notaUmtxt);
		
		System.out.println("Digite a nota 2 do aluno:");
		String notaDoistxt = scan.nextLine();
		double notaDois = Double.valueOf(notaDoistxt);
		
		CalculaMedia(notaUm,notaDois);

		

	}

}
