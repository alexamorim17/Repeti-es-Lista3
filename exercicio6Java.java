package Lista3Repetição;

import java.util.Scanner;

public class exercicio6Java {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int n, total,d , media;
		
		total = 0;
		d = 0;
		
		System.out.println("Digite um número: ");
		n = entrada.nextInt();
	
		
		do {
			
			if( n%3 == 0) {
				
				total = total + n;
				d +=1;
				
			}
			System.out.println("Digite um número: ");
			n = entrada.nextInt();
		}while(n != 0);
		
		media = total/d;
		
		System.out.println("Media :"+media);
		
		

	}

}
