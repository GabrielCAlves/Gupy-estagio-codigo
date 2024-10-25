package gupy;

import java.util.Scanner;

public class StringComA {

	public static void main(String[] args) {
		
		String palavra;
		char letra;
		boolean existe = false;
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Escreva alguma palavra: ");
		palavra = scan.nextLine();
		palavra = palavra.toLowerCase();
		
		for(int i=0; i < palavra.length(); ++i) {
			letra = palavra.charAt(i);
			if(letra == 'a') {
				++contador;
			}
		}
		
		if(contador > 0) {
			existe = true;
		}
		
		if(existe) {
			System.out.printf("A palavra fornecida contém a letra \"a\" e ela é escrita "+contador+" vez(es)");
		}else {
			System.out.printf("A palavra fornecida não contém a letra \"a\"");
		}
	}
}
