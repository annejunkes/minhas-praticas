package anne.praticas.poo.aula36ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAgenda {
	
	//ArrayList<Contato>contatos = new ArrayList<>();

	public static void main(String[] args) {

		ArrayList<Contato>contatos = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite nome da agenda: ");
		
		Agenda agenda = new Agenda();
		String nomeAgenda = scan.nextLine();
		agenda.setNome(nomeAgenda);

		System.out.println("-Cadastro de contatos-");
		
		System.out.println("Digite o nome do primeiro contato:");
		
		Contato c1 = new Contato();
		String nomeContato = scan.nextLine();
		c1.setNome(nomeContato);
		
		System.out.println("Email:");
		String emailContato = scan.nextLine();
		c1.setEmail(emailContato);
		
		System.out.println("Telefone:");
		String telefoneContato = scan.nextLine();
		c1.setTelefone(telefoneContato);
		
		contatos.add(c1);
		
		System.out.println("Digite o nome do segundo contato:");
		
		Contato c2 = new Contato();
		nomeContato = scan.nextLine();
		c2.setNome(nomeContato);
		
		System.out.println("Email:");
		emailContato = scan.nextLine();
		c2.setEmail(emailContato);
		
		System.out.println("Telefone:");
		telefoneContato = scan.nextLine();
		c2.setTelefone(telefoneContato);
		
		contatos.add(c2);
		
		System.out.println("Digite o nome do segundo contato:");
		
		Contato c3 = new Contato();
		nomeContato = scan.nextLine();
		c3.setNome(nomeContato);
		
		System.out.println("Email:");
		emailContato = scan.nextLine();
		c3.setEmail(emailContato);
		
		System.out.println("Telefone:");
		telefoneContato = scan.nextLine();
		c3.setTelefone(telefoneContato);
		
		contatos.add(c3);
		
		printar(agenda,contatos);
		 
	}
	
	public static void printar(Agenda agenda, ArrayList<Contato>contatos) {
				
		System.out.println("\nLista de contatos - Agenda " + agenda.getNome());
		 
		for(Contato c : contatos) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Telefone: " + c.getTelefone());
			
		}
		
	}

}
