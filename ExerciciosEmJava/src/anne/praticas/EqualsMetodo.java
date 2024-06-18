package anne.praticas;

public class EqualsMetodo {

	public static double CalculaPorSinal(double x,double y, String sinal) {
		
		double calculo=0;
		if(sinal.equals("+")) {
			calculo = x+y;
		}
		if(sinal.equals("-")) {
			calculo = x-y;
		}
		if(sinal.equals("/")) {
			calculo = x/y;
		}
		if(sinal.equals("*")) {
			calculo = x*y;
		}
		return calculo;
		
	}
	
	public static void main(String[] args) {
		
		double calculo = CalculaPorSinal(3.0,4.0,"/");
		System.out.println("Resultado = "+calculo);

	}

}
