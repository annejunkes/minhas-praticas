package anne.praticas.poo.aula39;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public String nomeVisibilidade; // public possibilita o acesso para a classe aluno que está em outro pacote

	protected String cpfVisibilidade; // protected pode ser acessado por pacotes classe e subclassse
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpfVisibilidade() {
		return cpfVisibilidade;
	}

	public void setCpfVisibilidade(String cpfVisibilidade) {
		this.cpfVisibilidade = cpfVisibilidade;
	}

	public String getNomeVisibilidade() {
		return nomeVisibilidade;
	}

	public void setNomeVisibilidade(String nomeVisibilidade) {
		this.nomeVisibilidade = nomeVisibilidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
