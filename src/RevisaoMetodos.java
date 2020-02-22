
public class RevisaoMetodos {
	
	public static void main(String[] args) {
		int num = 2;
	//int resultado  = dobroProximo(2);
	
		
		System.out.println("Proximo numero é:"+" "+ proximo(num));
		System.out.println("DobroProximo numero é:"+" "+ dobroProximo(num));
		
		
	}
	
	public static int proximo(int num) {
		
		return num + 1 ;
		
		
	}
	
	public static int dobroProximo(int num) {
		
		return proximo(num )*2;
		
	}

}
