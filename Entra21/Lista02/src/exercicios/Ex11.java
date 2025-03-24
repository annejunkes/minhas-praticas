package exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o código do seu cargo: ");
		int codigoCargo = scan.nextInt();
		
		System.out.println("Informe o seu salário: ");
		float salario = scan.nextFloat();
		
		float diferenca = 0;
		float salarioNovo = 0;
		
		switch(codigoCargo) {
		
		case 101:
			salarioNovo = (float) (salario*1.1);
			diferenca = salarioNovo-salario;
			break; 
			
		case 102:
			salarioNovo = (float) (salario*1.2);
			diferenca = salarioNovo-salario;
			break; 
			
			
		case 103:
			salarioNovo = (float) (salario*1.3);
			diferenca = salarioNovo-salario;
			break; 
			
			
			default: 
				salarioNovo = (float) (salario*1.4);
				diferenca = salarioNovo-salario;
				break; 
				
		}
		
		System.out.printf("Salario antigo: R$%.2f\n", salario);
		System.out.printf("Salario com acréscimo: R$%.2f\n", salarioNovo);
		System.out.printf("Diferença: R$%.2f\n", diferenca);
		

	}

}
