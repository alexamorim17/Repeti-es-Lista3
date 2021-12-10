package Lista3Repetição;

import java.util.Scanner;

public class exercicio2Java {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = 0,i = 0, p = 0,resposta;
		
		
		
		for(x = 1; x<=10;x++ ) {
			
			System.out.println("Digite um número");
			resposta = entrada.nextInt();
			
			
			if(resposta%2==0) {
				
				System.out.println("O número é par");
				p += 1;
			}else {
				
				System.out.println("O número é impar");
				i +=1;
			}
			
			
		}
		
		
		
		System.out.println("Quantidade de números ímpares: "+ i);
		System.out.println("Quantidade de números pares: "+ p);
	}

}
