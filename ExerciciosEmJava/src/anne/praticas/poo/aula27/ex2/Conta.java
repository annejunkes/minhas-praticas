package anne.praticas.poo.aula27.ex2;

public class Conta {
	int numero;
	double saldo;
	boolean especial;
	double limiteMin;
	double limiteMax;
	
	
	double realizarSaque(double saque) {
		if((saldo - saque) >= limiteMin) {
			saldo = saldo - saque;
		}
		if((saldo - saque) < limiteMin) {
			System.out.println("Saldo insuficiente para saque");
		}
		return saldo;
	}
	
	double depositarDinheiro(double credito) {
		if((saldo + credito) <= limiteMax) {
			saldo = saldo + credito;		
		}if((saldo + credito) > limiteMax) {
			System.out.println("Credito ultrapassa limite da conta");
		}
		return saldo;
		
	}

}
