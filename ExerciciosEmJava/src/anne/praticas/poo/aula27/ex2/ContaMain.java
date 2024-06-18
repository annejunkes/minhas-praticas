package anne.praticas.poo.aula27.ex2;

public class ContaMain {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.numero = 113343;
		conta.saldo = 0;
		conta.especial = true;
		conta.limiteMin = -100.0;
		conta.limiteMax = 900.0;
		
		double saque = conta.realizarSaque(100);
		
		System.out.println(conta.saldo);
		
		double credito = conta.depositarDinheiro(800);
		
		System.out.println(conta.saldo);

	}

}
