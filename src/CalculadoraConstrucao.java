
public class CalculadoraConstrucao {
	public static void main(String[] args) {
		
		double larg = 20;
		double compr = 20;
		double custo = 60;
		double diametro = 6;
		
		double custoCasa = Casa.total(larg, compr);
		double custoPiscina = Piscina.total(diametro);
		
		System.out.println("Custo total da Casa"+" "+String.format("R$%.2f",total(custoCasa, custoPiscina)));
		
		
	}
	
	public static double total(double custoCasa, double custoPiscina) {
		
		return custoCasa + custoPiscina;
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
