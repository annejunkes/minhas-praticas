package temporizador;

public class TemporizadorThread implements Runnable{
	private String nome;
	private int intervalo;
	
	public TemporizadorThread(String nome, int intervalo) {
		this.nome = nome;
		this.intervalo = intervalo;
	}
	
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(nome + " - Contagem: " + i);
		}
		try {
			Thread.sleep(intervalo);
		} catch (InterruptedException e) {
			System.out.println(nome + " foi interrompida");
		}
		System.out.println(nome + " finalizou execução");
		
	}


}
