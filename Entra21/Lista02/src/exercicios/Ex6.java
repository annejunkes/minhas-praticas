package exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		
		if(lado1!=lado2 && lado2!=lado3) {
			System.out.println("Triângulo escaleno");
		}
		else {
			if(lado1 == lado2 && lado2==lado3) {
				System.out.println("Triângulo equilátero");
			}
			else {
				System.out.println("Triângulo isóceles");
			}
		}
			


	}

}
