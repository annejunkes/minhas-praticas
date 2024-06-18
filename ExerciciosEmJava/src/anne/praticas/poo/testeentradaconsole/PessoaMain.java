package anne.praticas.poo.testeentradaconsole;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite nome da pessoa");
		
		pessoa.setNome(pessoa.getNome());

	}

}
