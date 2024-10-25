package gupy;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		int numero,valor1=0,valor2=1,proximo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Informe um número (Inteiro): ");
		numero = scan.nextInt();
		
		if(numero != valor1 && numero != valor2) {
			while(true) {
				proximo = valor1 + valor2;
				valor1 = valor2;
				valor2 = proximo;
				
				if(valor2 == numero) {
					System.out.println("O número informado pertence a sequência");
					break;
				}else if(valor1 < numero && numero < valor2) {
					System.out.println("O número informado não pertence a sequência");
					break;
				}
			}
		}else {
			System.out.println("O número informado pertence a sequência");
		}
	}
}
