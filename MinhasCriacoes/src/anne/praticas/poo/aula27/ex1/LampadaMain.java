package anne.praticas.poo.aula27.ex1;

public class LampadaMain {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.cor = "amarela";
		lampada.tipoLuz = "led";
		
		System.out.println("Lampada");
		System.out.println("Cor: " + lampada.cor);
		System.out.println("Tipo:" + lampada.tipoLuz);
		

		lampada.ligar();
		
		lampada.exibirEstado();
		
		lampada.mudarEstado();
	
		lampada.exibirEstado();

	}

}
