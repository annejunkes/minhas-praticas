package exercicios;

import java.util.Scanner;

/*Escreva um algoritmo para ler o número de identificação, 
 * as três notas obtidas por um aluno e a média dos exercícios que fazem parte da avaliação. 
 * Calcular a média de aproveitamento, usando a fórmula:
    MA = (Nota1 + Nota2 x 2 + Nota3 x 3 + ME ) / 7

A atribuição de conceitos obedece a tabela abaixo:

	MA		Conceito
	
	9,0				A
	
	7,5 e < 9,0 	B
	
	6,0 e < 7,5 	C
	
	4,0 e < 6,0 	D
	
	< 4,0	 		E
	*/

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nº de identificação do aluno: ");
		int idAluno = scan.nextInt();
		
		System.out.println("Digite a 1ª nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Digite a 2ª nota: ");
		float nota2 = scan.nextFloat();
		
		System.out.println("Digite a 3ª nota: ");
		float nota3 = scan.nextFloat();

		System.out.println("Digite a média dos exercícios: ");
		float mediaExercicios = scan.nextFloat();
		
		float mediaAproveitamento = (nota1 + nota2* 2 + nota3*3 + mediaExercicios)/7;
		
		char conceito;
		
		if(mediaAproveitamento>=9) {
			conceito = 'A';
		}
		else {
			if(mediaAproveitamento<9 && mediaAproveitamento>=7.5) {
				conceito = 'B';
			}
			else {
				if(mediaAproveitamento<7.5 && mediaAproveitamento>=6) {
					conceito = 'C';
				}
				else {
					if(mediaAproveitamento<6 && mediaAproveitamento>=4) {
				conceito = 'D';
				}
					else {
							conceito = 'D';
					}
				}
			}
		}
		
		System.out.println("Nº do aluno: " + idAluno);
		System.out.println("1ª nota: " + nota1 + "\n2ª nota: " + nota2 + "\n3ª nota: " + nota3);
		System.out.println("Média dos exercícios: " + mediaExercicios);
		System.out.println("Média de aproveitamento: " + mediaAproveitamento);
		System.out.println("Conceito: " + conceito);
		
		if(conceito=='A' || conceito=='B' || conceito=='C') {
			System.out.println("Situação final: aprovado(a)");
		}
		else {
			System.out.println("Situação final: reprovado(a)");
		}
	}

}
