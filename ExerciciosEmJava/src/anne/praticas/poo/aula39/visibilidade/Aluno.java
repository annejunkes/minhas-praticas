package anne.praticas.poo.aula39.visibilidade;

import anne.praticas.poo.aula39.Pessoa;

public class Aluno extends Pessoa {

	private String matricula;
	private double[] notas;
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "Giulia";
		this.setNomeVisibilidade("Giulia");
		
		this.cpfVisibilidade = "344555";
		this.setCpf("344555");
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
