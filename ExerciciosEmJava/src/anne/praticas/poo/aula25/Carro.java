package anne.praticas.poo.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	double autonomia;
	
	//metodo sem retorno
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + autonomia + " km");
	}
	
	//metodo com retorno
	double obterAutonomia() {
		autonomia = capCombustivel * consumoCombustivel;
		return autonomia;
	}
	
	//metodo com parametro
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
