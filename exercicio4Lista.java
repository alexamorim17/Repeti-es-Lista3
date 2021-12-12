

import java.util.Scanner;

public class exercicio4Lista{

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int idade, sexo, personalidade, n, c, mn, ha, oc, pn40, pc18;
		
		n = 0;
		idade = 0;
		sexo = 0;
		personalidade = 0;
		c= 0;
		mn = 0;
		ha = 0;
		oc = 0;
		pn40 = 0;
		pc18 = 0;
		
		while(n<=150) {
			
			System.out.println("Digite sua idade");
			idade = entrada.nextInt();
			System.out.println("Digite seu sexo(1-Masculino/2-Feminino/3-Outros): ");
			sexo = entrada.nextInt();
			
			System.out.println("Digite sua personalidade(1-Calma/2-Nervosa/3-Agressiva");
			personalidade = entrada.nextInt();
			
			
			//pessoas calmas
			if ( personalidade == 1) {
				
				c +=1;
				
			}
			//mulheres nervosas
			if(personalidade == 2 && sexo == 2) {
				
				mn +=1;
			}
			//homens agressivos
			if(personalidade == 3 && sexo == 1) {
				
				ha +=1;
			}
			//outros calmos
			if(personalidade ==1 && sexo ==3) {
				
				oc +=1;
			}
			//pessoas nervosas com mais de 40
			
			if(personalidade == 2 && idade >40) {
				
				pn40+=1;
			}
			//pessoas calmas com menos de 18
			
			if(personalidade == 1 && idade <18 ) {
				
				pc18+=1;
			}
			
			if (idade == -99) {
				
				break;
			}
			
			n+=1;
			
		}
		entrada.close();
		
		System.out.println("Numero de pessoas calmas: "+c);
		System.out.println("Numero de mulheres nervosas: "+mn);
		System.out.println("Numero de homens agressivos: "+ha);
		System.out.println("Numero de outros calmos: "+oc);
		System.out.println("Numero de pessoas nervosas com mais de 40 anos: "+pn40);
		System.out.println("Numero de pessoas calmas com menos de 18 anos: "+pc18);
		
		
	}

}
