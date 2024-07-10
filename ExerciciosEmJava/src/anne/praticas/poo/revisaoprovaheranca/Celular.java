package anne.praticas.poo.revisaoprovaheranca;

public class Celular extends Aparelho {
	
	private int camera;
	private boolean flexivel;
	private Carregador carregador;
	
	public Carregador getCarregador() {
		return carregador;
	}
	public void setCarregador(Carregador carregador) {
		this.carregador = carregador;
	}
	public int getCamera() {
		return camera;
	}
	public void setCamera(int camera) {
		this.camera = camera;
	}
	public boolean isFlexivel() {
		return flexivel;
	}
	public void setFlexivel(boolean flexivel) {
		this.flexivel = flexivel;
	}

}
