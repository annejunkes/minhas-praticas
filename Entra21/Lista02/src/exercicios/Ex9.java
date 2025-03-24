package exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o código do item desejado: ");
		int codigoItem = scan.nextInt();
		
		System.out.println("Digite a quantidade do item: ");
		int qtdItem = scan.nextInt();
		
		float valor=0;
		
		switch(codigoItem) {
		
		case 100:
			valor = (float) (qtdItem*1.20);
			break;
			
		case  101:
			valor = (float) (qtdItem*1.30);
			break;
			
		case  102:
			valor = (float) (qtdItem*1.50);
			break;
			
		case  103:
			valor = (float) (qtdItem*1.20);
			break;
			
		case  104:
			valor = (float) (qtdItem*1.30);
			break;
			
		case  105:
			valor = (float) (qtdItem*1.00);
			break;
			
			default:
				System.out.println("O codigo do pedido está incorreto");
		}
		
		System.out.println("Valor a ser pago: " + valor);
		
	}

}
