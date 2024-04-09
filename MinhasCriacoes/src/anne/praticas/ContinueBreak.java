package anne.praticas;

import java.util.Scanner;

public class ContinueBreak {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Números Pares (0-100):");
		
		for(int i=0; i<=100;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
		
        System.out.println("Números Impares (0-100):");
		
		for(int i=0; i<=100;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
