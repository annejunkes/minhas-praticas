package exercicios;

import java.util.Scanner;

public class Ex12 {

	/*Escreva um algoritmo para ler um conjunto de quatro valores I, A, B, C, 
	 * onde I é um valor inteiro e positivo e A, B, C, são quaisquer valores reais. 
	 * A seguir: 

	    a) Se I = 1 escrever os três valores A, B, C em ordem crescente.
	    b) Se I = 2 escrever os três valores A, B, C em ordem decrescente.
	    */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro e positivo: ");
		int i = scan.nextInt();
		
		System.out.println("Insira 3 valores reais: ");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
			
			if(i==1) {
				if(a<b && a<c) {
					System.out.println(a);
					if(b<c) {
						System.out.println(b + "\n" + c);
					}
					else {
						System.out.println(c + "\n" + b);
					}
				}else {
					if(b<a && b<c) {
						System.out.println(b);
						if(a<c) {
							System.out.println(a + "\n" + c);
						}
						else {
							System.out.println(a);
						}
					}
					else {
						System.out.println(c);
						if(b<a) {
							System.out.println(b + "\n" + a);
						}
						else{
							System.out.println(a + "\n" + b);
						}
					}
				}
			
			}
			
			else {
			
			if(i==2) {
				if(a>b && a>c) {
					System.out.println(a);
					if(b>c) {
						System.out.println(b + "\n" + c);
					}
					else {
						System.out.println(c + "\n" + b);
					}
				}else {
					if(b>a && b>c) {
						System.out.println(b);
						if(a>c) {
							System.out.println(a + "\n" + c);
						}
						else {
							System.out.println(a);
						}
					}
					else {
						System.out.println(c);
						if(b>a) {
							System.out.println(b + "\n" + a);
						}
						else{
							System.out.println(a + "\n" + b);
						}
					}
				}
			
			}
			}
			
		
			
		}
	

	

}
