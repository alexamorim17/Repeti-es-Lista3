package Lista3Repetição;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int x;
		
		
		for(x = 1000;x <=1999; x++) {
			
			if(x%11 == 5) {
				System.out.println(x);
			}
		}
		
		entrada.close();
	
	}
}