
public class Piscina {
	
	public static void main(String[] args) {
		 
		
		double diametro = 6;
		double custo = 75;
		System.out.println(total(diametro));
		
		
	}
	
	public static double raio(double diametro) {
		
		return diametro/2;
	}
	
	public static double areaPiscina(double raio) {
		return Math.PI * Math.pow(raio, 2);
	
	}
	
	public static double total(double diametro) {
		
		double raio = raio(diametro);
		double areaPiscina = areaPiscina(raio);
		return areaPiscina * 75;
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
