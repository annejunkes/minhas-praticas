package anne.praticas.poo.aula27.ex1;

public class Lampada {
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void exibirEstado() { 
		if(ligada) {
			System.out.println("A lampada esta ligada");
		}
		else {
			System.out.println("A lampada esta desligada");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligar();			
		}
		else {
			ligar();
		}
	}

}
