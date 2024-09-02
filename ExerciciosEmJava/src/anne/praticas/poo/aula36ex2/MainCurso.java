package anne.praticas.poo.aula36ex2;

import java.util.Scanner;

public class MainCurso {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Professor prof = new Professor();
		
		prof.setNome("Marina Soares");
		prof.setDepartamento("Arquitetura");
		prof.setEmail("marina@gmail.com");
		
		Curso arquitetura = new Curso();
		
		arquitetura.setNome("Arquitetura");
		arquitetura.setHorario("Noturno");
		arquitetura.setProfessor(prof);
		
		
		Aluno[] alunos = new Aluno[5];
		
		for(int i=0; i<alunos.length; i++) {
			
			Aluno a = new Aluno();
		}
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Murphy");
		a1.setMatricula("1335543");
		
		System.out.println("Digite as 4 notas do(a) estudante" + a1.getNome() + ":");
		
		double[] n = new double[4];
		String n1Txt = scan.nextLine();
		n[0] = Double.valueOf(n1Txt);
		n1Txt = scan.nextLine();
		n[1] = Double.valueOf(n1Txt);
		n1Txt = scan.nextLine();
		n[2] = Double.valueOf(n1Txt);
		n1Txt = scan.nextLine();
		n[3] = Double.valueOf(n1Txt);
		
		a1.setNotas(n);
		
		double soma = 0;
		for(int i=0;i<n.length; i++) {
			soma = soma + n[i];
		}
	

		
		double media = soma/4;


		System.out.println("Notas:" + a1.getNotas(n));
	}

}
