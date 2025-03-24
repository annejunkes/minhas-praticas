package anne.praticas.beecrowd;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class Beecrowd1021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String valorTxt = scan.nextLine();
		Double valor = Double.valueOf(valorTxt);
		
		//String padrao = "###,###,###.##";
		//DecimalFormat df = new DecimalFormat(padrao);
		
			double notas100 = valor/100.0;
			//if(notas100>=1) {
				
				//notas100++;
				
			//}
		
		System.out.println("NOTAS: "
				+ notas100 + " nota(s) de R$ 100.00"
				+ "1 nota(s) de R$ 50.00"
				+ "1 nota(s) de R$ 20.00"
				+ "	0 nota(s) de R$ 10.00"
				+ "1 nota(s) de R$ 5.00"
				+ "0 nota(s) de R$ 2.00"
				+ "MOEDAS:"
				+ "1 moeda(s) de R$ 1.00"
				+ "1 moeda(s) de R$ 0.50"
				+ "0 moeda(s) de R$ 0.25"
				+ "2 moeda(s) de R$ 0.10"
				+ "0 moeda(s) de R$ 0.05"
				+ "3 moeda(s) de R$ 0.01");
		
	}

}
