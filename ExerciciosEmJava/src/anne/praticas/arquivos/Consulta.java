package anne.praticas.arquivos;

import java.util.ArrayList;

public class Consulta {
	
	private ArrayList<Cliente>clientes = new ArrayList<>();

	public Consulta() { //construtor
		this.clientes=new ArrayList<>();
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
}
