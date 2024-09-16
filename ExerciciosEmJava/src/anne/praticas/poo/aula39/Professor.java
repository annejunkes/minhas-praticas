package anne.praticas.poo.aula39;

public class Professor extends Pessoa{
	
	private String departamento;
	private String email;
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "Ana";
		this.setNomeVisibilidade("Ana");
		
		this.cpfVisibilidade = "1233333";
		this.setCpfVisibilidade("1233333");
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
