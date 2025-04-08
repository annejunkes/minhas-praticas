package exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		
		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.println("Digite um valor para A(" + i + ", " + j + "):");
				a[i][j] = scan.nextInt();
				
				System.out.println("Digite um valor para B(" + i + ", " + j + "):");
				b[i][j] = scan.nextInt();
				
			}
		}
		

		for(int i =0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				c[i][j]= a[i][j]*b[i][j];
				System.out.println(c[i][j]);
			}
		}
		
			

	}

}
