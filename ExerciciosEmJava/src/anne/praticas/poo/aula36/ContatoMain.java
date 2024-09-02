package anne.praticas.poo.aula36;

import java.util.ArrayList;

public class ContatoMain {

	public static void main(String[] args) {

		ArrayList<Contato>contatos = new ArrayList<>();
		ArrayList<Endereco>enderecos = new ArrayList<>();
		ArrayList<Telefone>telefones= new ArrayList<>();
	
		Contato contato = new Contato();
		
		contato.setNome("Hamilton");
		
		Endereco endereco = new Endereco();
		endereco.setCep("333333");
		endereco.setCidade("Goiânia");
		endereco.setEstado("Goiás");
		endereco.setRua("Laranjeiras");
		endereco.setNumero(85);
		
		contato.setEndereco(endereco);
		
		Telefone telefone1 = new Telefone();
		telefone1.setTipo("celular");
		telefone1.setDdd("11");
		telefone1.setNumero("99914-2355");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("residencial");
		telefone2.setDdd("11");
		telefone2.setNumero("98955-1623");
		
		Telefone[] telefone = new Telefone[2];
		telefone[0] = telefone1;
		telefone[1] = telefone2;
		
		contato.setTelefones(telefone);
		
		contatos.add(contato);
		
		System.out.println("Lista de contatos\n");
		
		for(Contato c : contatos) {
			
			System.out.println("Nome: "+ c.getNome());
			System.out.println("Estado: "+ c.getEndereco().getEstado());
			System.out.println("Cidade: "+ c.getEndereco().getCidade());
			System.out.println("Rua: "+ c.getEndereco().getRua() + " nº" + c.getEndereco().getNumero());
			System.out.println("CEP: "+ c.getEndereco().getCep());
			
			System.out.println("\nNúmeros de telefone:");
			for(Telefone t : c.getTelefones()) {
			System.out.println("(" + t.getDdd() + ") " + t.getNumero());
			System.out.println("Tipo:" + t.getTipo());
			}
		}
		System.out.println("");
	}

}
