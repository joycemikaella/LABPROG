
	/*
	 * Joyce Mikaella das Mercês Aciole */

	import java.util.Scanner;

	public class Jokenpo {
	    public static void main (String[] args) {
	    	
	    	int jogador;
	    	int jogador2;
	    	Scanner n1 = new Scanner (System.in);
	    	Scanner n2 = new Scanner (System.in);
	    	
	    	while(true) {
	    		System.out.println("(1)PEDRA, (2)PAPEL, (3)TESOURA.");
	    		System.out.println("Digite a opção desejada:");
	    		jogador=n1.nextInt();
	    		System.out.println("(1)PEDRA, (2)PAPEL, (3). TESOURA.");
	    		System.out.println("Digite a opção desejada:");
	    		jogador2=n2 .nextInt();
	    		switch (jogador) {
	    		case 1:
	    			System.out.println("jogador1 escolheu PEDRA!");
	    			break;
	    		case 2:
	    			System.out.println("jogador1 escolheu PAPEL!");
	    			break;
	    		case 3:
	    			System.out.println("jogador1 escolheu TESOURA!");
	    			break;
	    		default:
	    			System.out.println("Opção invalida");
	    			break;

	    		}

	    	  switch (jogador2) {
	    		case 1:
	    			System.out.println("Jogador2 escolheu PEDRA!");
	    			break;
	    		case 2:
	    			System.out.println("Jogador2 escolheu PAPEL!");
	    			break;
	    		case 3:
	    			System.out.println("jogador2 escolheu TESOURA!");
	    			break;
	    		}
	    		if (jogador != jogador2) {
	    			if ((jogador==1 && jogador2 ==3) || (jogador==2 && jogador2==1) || (jogador==3 && jogador2==2)) {
	    				System.out.println("Jogador1 venceu!");
	    			} else {
	    				System.out.println("Jogador2 venceu!");

	    			}	
	    		} else {
	    			System.out.println("Empate!");

	    		}
	    		
	    		n1.nextLine();
	    		final String SAIR = "-1";
	    		
	    	
	    			if(n1.nextLine().equals(SAIR))
	    				break;
	    		
	    	}
	    }
	
	}

