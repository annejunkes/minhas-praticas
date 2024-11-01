package ifsc;

public class ExemploThreads {

	public static void main(String[] args) {
		MinhaThread tarefa1 = new MinhaThread("Thread 1");
		MinhaThread tarefa2 = new MinhaThread("Thread 2");
		
		Thread thread1 = new Thread(tarefa1);
		Thread thread2 = new Thread(tarefa2);
		
		thread1.start();
		thread2.start();
		
		//Aguarda finalização das threads
		try {
			thread1.join();
			thread2.join();
		}catch(InterruptedException e) {
			System.out.println("A execução pricipal foi interrompida");
		}
		System.out.println("Todas as threads foram finalizadas.");

	}

}
