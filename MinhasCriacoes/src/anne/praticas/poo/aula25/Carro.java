package anne.praticas.poo.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	double autonomia;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + autonomia + " km");
	}
	
	double obterAutonomia() {
		autonomia = capCombustivel * consumoCombustivel;
		return autonomia;
	}

}
