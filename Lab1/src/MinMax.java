import java.util.Scanner;

public class MinMax {
	
	
	public static void main (String [] args ) {
		
		final int CONTADOR = 3;
		Scanner sc = new Scanner (System.in);
		int mínimo = Integer.MAX_VALUE ;
		int máximo = Integer.MIN_VALUE;
		
		for (int i = 0; i< CONTADOR; i++) {
			
			System.out.print("Digite o número :");
			
			int numero = sc.nextInt();
			
			if ( numero < mínimo) {
				
				mínimo = numero;
				}
		
			if (numero > máximo) {
			
			máximo = numero;
			} 
	
		}
	
		
		System.out.println ("O MENOR NUMERO É " + mínimo);
		System.out.println ("O MAIOR NÚMERO É " + máximo);
	}
	
	
}


