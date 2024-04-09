package anne.praticas.poo.aula25;

import java.util.Scanner;

public class CarroMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Duacto";
		van.numPassageiros = 2;
		van.capCombustivel = 100.0;
		van.consumoCombustivel = 0.2;

		van.exibirAutonomia();
		

	}

}
 