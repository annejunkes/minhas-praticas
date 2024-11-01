package ifsc;

public class MinhaThread implements Runnable{
	
	private String nome;
	
	public MinhaThread(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		for(int i=1; i<5; i++) {
			System.out.println(nome + " execução: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(nome + " foi interrompida.");
			}
		}
		System.out.println(nome + " finalizou execução.");
	}

}
