package Lista3Repeti��o;

import java.util.Scanner;

public class exercicio2Java {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = 0,i = 0, p = 0,resposta;
		
		
		
		for(x = 1; x<=10;x++ ) {
			
			System.out.println("Digite um n�mero");
			resposta = entrada.nextInt();
			
			
			if(resposta%2==0) {
				
				System.out.println("O n�mero � par");
				p += 1;
			}else {
				
				System.out.println("O n�mero � impar");
				i +=1;
			}
			
			
		}
		
		
		
		System.out.println("Quantidade de n�meros �mpares: "+ i);
		System.out.println("Quantidade de n�meros pares: "+ p);
	}

}
