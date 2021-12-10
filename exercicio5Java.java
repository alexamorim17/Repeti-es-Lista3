package Lista3Repetição;

import java.util.Scanner;

public class exercicio5Java {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double total, n;
		
		
		n = 0;
		total = 0;
		
		
		System.out.println("Digite um número:");
		n = entrada.nextDouble();
		
		do {
			
			total = total+n;
			System.out.println("Digite um número:");
			n = entrada.nextDouble();
		}while(n != 0);
		
		entrada.close();
		
		System.out.println("Total :"+total);

	}

}
