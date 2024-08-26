package anne.praticas.poo.aula36;

import java.util.ArrayList;

public class ContatoMain {

	public static void main(String[] args) {

		ArrayList<Contato>contatos = new ArrayList<>();
		ArrayList<Endereco>enderecos = new ArrayList<>();
		Contato contato = new Contato();
		
		contato.setNome("Hamilton");
		contato.setTelefone("(11)99914-2355");
		
		Endereco endereco = new Endereco();
		endereco.setCep("333333");
		endereco.setCidade("Goiânia");
		endereco.setEstado("Goiás");
		endereco.setRua("Laranjeiras");
		endereco.setNumero(85);
		
		contato.setEndereco(endereco);
		contatos.add(contato);
		
		System.out.println("Lista de contatos\n");
		
		for(Contato listacontato : contatos) {
			
			System.out.println("Nome: "+ listacontato.getNome());
			System.out.println("Telefone: "+ listacontato.getTelefone());
			System.out.println("Estado: "+ listacontato.getEndereco().getEstado());
			System.out.println("Cidade: "+ listacontato.getEndereco().getCidade());
			System.out.println("Rua: "+ listacontato.getEndereco().getRua() + " nº" + listacontato.getEndereco().getNumero());
			System.out.println("CEP: "+ listacontato.getEndereco().getCep());
			
		}
		System.out.println("");
	}

}
