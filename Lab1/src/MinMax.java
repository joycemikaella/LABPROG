import java.util.Scanner;

public class MinMax {
	
	
	public static void main (String [] args ) {
		
		final int CONTADOR = 3;
		Scanner sc = new Scanner (System.in);
		int m�nimo = Integer.MAX_VALUE ;
		int m�ximo = Integer.MIN_VALUE;
		
		for (int i = 0; i< CONTADOR; i++) {
			
			System.out.print("Digite o n�mero :");
			
			int numero = sc.nextInt();
			
			if ( numero < m�nimo) {
				
				m�nimo = numero;
				}
		
			if (numero > m�ximo) {
			
			m�ximo = numero;
			} 
	
		}
	
		
		System.out.println ("O MENOR NUMERO � " + m�nimo);
		System.out.println ("O MAIOR N�MERO � " + m�ximo);
	}
	
	
}


