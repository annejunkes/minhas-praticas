package anne.praticas.poo.revisaoprovaheranca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Celular>celulares= new ArrayList<>();

		Carregador carregadorAnne = new Carregador();
		
		carregadorAnne.getPotencia();
		carregadorAnne.setPotencia(220);
		
		
		Celular anne = new Celular();
		
		anne.getMarca();
		anne.setMarca("xiaomi");
		anne.getPreco();
		anne.setPreco(900.99);
		anne.getCamera();
		anne.setCamera(12);
		anne.getCarregador();
		anne.setCarregador(carregadorAnne);
		anne.isFlexivel();
		anne.setFlexivel(false);
		
		celulares.add(anne);
		

		Carregador carregadorMabi = new Carregador();
		
		carregadorMabi.getPotencia();
		carregadorMabi.setPotencia(180);
		
		
		Celular mabi = new Celular();
		
		mabi.getMarca();
		mabi.setMarca("samsung");
		mabi.getPreco();
		mabi.setPreco(850.99);
		mabi.getCamera();
		mabi.setCamera(24);
		mabi.getCarregador();
		mabi.setCarregador(carregadorMabi);
		mabi.isFlexivel();
		mabi.setFlexivel(true);
		
		celulares.add(mabi);
		
		System.out.println("Celulares:\n");
		
		for(Celular celular : celulares) {
			
			System.out.println("Marca: " + celular.getMarca());
			System.out.println("preco: " + celular.getPreco());
			System.out.println("Camera(megapixels): " + celular.getCamera());
			System.out.println("potencia carregador: " + celular.getCarregador().getPotencia() + "w");
			System.out.println("Flexivel: " + celular.isFlexivel());
			System.out.println();
		}
		
		
	}

}
