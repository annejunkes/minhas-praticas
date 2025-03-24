package exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o seu saldo médio: ");
		float saldoMedio = scan.nextFloat();
		
		float credito = 0;
		
		if(saldoMedio<=200) {
			credito = 0;
		}
		else {
			if(saldoMedio>200 && saldoMedio<=400) {
				credito = (float) (saldoMedio*0.2);
			}
			else {
				if(saldoMedio>400 && saldoMedio<=600) {
					credito = (float) (saldoMedio*0.3);
					
				}
				else {
					credito = (float) (saldoMedio*0.4);
				}
			}
		}
		System.out.println("Saldo médio: " + saldoMedio);
		System.out.println("Crédito: " + credito);

	}

}
