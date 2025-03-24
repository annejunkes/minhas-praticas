package exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o código do aluno:");
		int codigoAluno = scan.nextInt();
		
		System.out.println("Informe a nota 1:");
		float nota1 = scan.nextFloat();
		
		System.out.println("Informe a nota 2:");
		float nota2 = scan.nextFloat();
		
		System.out.println("Informe a nota 3:");
		float nota3 = scan.nextFloat();
		
		float maior = 0;
		float menor1=0;
		float menor2=0;
		
		if(nota1>nota2 && nota1>nota3) {
			maior = nota1;
			menor1 = nota2;
			menor2 = nota3;
		}
		else {
			if(nota2>nota1 && nota2>nota3) {
				maior = nota2;
				menor1 = nota1;
				menor2 = nota3;
			}
			else {
				maior = nota3;
				menor1 = nota1;
				menor2 = nota2;
			}
		}
		
		float media =  (float) ((maior*0.4) + (menor1*0.3) + (menor2*0.3));
		
		System.out.println("Código do aluno: " + codigoAluno);
		System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3);
		System.out.println("Média: " + media);
		

	}

}
