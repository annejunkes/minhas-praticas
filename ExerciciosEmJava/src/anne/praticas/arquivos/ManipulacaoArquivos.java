package anne.praticas.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoArquivos {

	public static void main(String[] args) throws IOException {
		
		File chamada = new File("C:\\Users\\anneb\\OneDrive\\Área de Trabalho\\Github\\minhas-praticas\\ExerciciosEmJava\\src\\anne\\praticas\\arquivos\\chamada.txt");
		
		FileWriter fw = new FileWriter(chamada);
		
		fw.write("Anne");
		fw.close();

	}

}
