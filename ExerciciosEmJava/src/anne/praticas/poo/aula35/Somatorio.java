package anne.praticas.poo.aula35;

public class Somatorio {

	public static void main(String[] args) {

		int n = 5;
		
		System.out.println("Soma de 1 a " + n + " = " +somatorio(n));

	}
	
	public static int somatorio(int n) {

		
		if(n==1) {
			return 1;
		}

		return n+somatorio(n-1);
	}

}
