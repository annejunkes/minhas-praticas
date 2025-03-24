package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Hora inicial do jogo:");
		int horaInicio = scan.nextInt();
		System.out.println("Hora final do jogo:");
		int horaFinal = scan.nextInt();
		
		int duracao = 0;
		
		duracao = horaFinal-horaInicio;
		
		if(horaInicio>=horaFinal) {
			
		
			duracao = (24-horaInicio) + horaFinal;
		}
		System.out.println(duracao + " horas");

	}

}
