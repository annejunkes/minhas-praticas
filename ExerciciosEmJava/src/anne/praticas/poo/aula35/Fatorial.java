package anne.praticas.poo.aula35;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fatorial do número:");
		String numTxt = scan.nextLine();
		int num = Integer.valueOf(numTxt);
		
		//int fatorial =1;

		//for(int i=num;i>1;i--) {
			//fatorial *=i;
		//}
		
		System.out.println("O fatorial de " + num + " é " + fatorial(num));

	}
	
	public static int fatorial(int num) {
		
		if(num==0) {
			return 1;
		}
		
		return num*fatorial(num-1);
	}

}
