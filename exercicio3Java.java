package Lista3Repetição;

import java.util.Scanner;

public class exercicio3Java {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int idade,n,v ;
		
		n = 0;
		v = 0;
		
		System.out.println("Digite a idade:" );
		idade = entrada.nextInt();
		
		while(idade !=-99) {
			
			System.out.println("Idade :"+idade);
			
			if(idade < 21) {
				
				n +=1;
			}
			
			if(idade > 50) {
				
				v +=1;
			}
			
			System.out.println("Digite a idade(-99 para sair):" );
			idade = entrada.nextInt();
			
		}
		
		System.out.println("Total de pessoas maiores de 50 anos: "+v);
		
		System.out.println("Total de pessoas menores de 21 anos: "+n);
		
		

	}

}
