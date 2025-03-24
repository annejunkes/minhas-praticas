package exercicios;

import java.util.Scanner;

/*O departamento que controla o índice de poluição do meio ambiente mantém três grupos 
 * de indústrias que são altamente poluentes. O índice de poluição aceitável varia de 
 * 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do primeiro grupo são intimadas 
 * a suspenderem suas atividades. Caso o índice cresce para 0,4 as empresas do primeiro e 
 * segundo grupo são intimadas a suspenderem suas atividades. Por fim, se o índice atingir 0,5 
 * todos os três grupos devem ser notificados a paralisarem suas atividades. Escreva um algoritmo 
 * para ler o índice de poluição medido e emitir a notificação adequada aos diferentes grupos de empresas.
 */

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o índice de poluição: ");
		float indicePoluicao = scan.nextFloat();
		
		if(indicePoluicao>=0.3) {
			System.out.println("Empresas do 1º grupo devem suspender suas atividades");
		}
		if(indicePoluicao>=0.4) {
			System.out.println("Empresas do 2º grupo devem suspender suas atividades");
		}
		if(indicePoluicao>=0.5) {
			System.out.println("Empresas do 3º grupo devem suspender suas atividades");
		}
		else {
			System.out.println("Índice de poulição aceitável");
		}

	}

}
