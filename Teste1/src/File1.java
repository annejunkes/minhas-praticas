import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {

		File f = new File("f.txt");
		
		try {
		if(!f.exists()) {
			
			f.createNewFile();
			
		}
		else if(f.exists() && f.isDirectory()) {
			System.out.println("Objeto existe e é um diretório");
		}
		else if(f.exists() && f.isFile()) {
			System.out.println("Objeto existe e é um arquivo " + f.getName());
		}
		
		File f2 = new File("./");
		
		if(f2.exists() && f2.isDirectory()) {
			File[] lista = f2.listFiles();
			
			for(File file : lista) {
				
				if(file.isDirectory()) {
					System.out.println("Diretorio " + file.getName());				
				}
				else {
					System.out.println("Arquivo " + file.getName());
				}
			}
		}
		
		
		
		}
				
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
