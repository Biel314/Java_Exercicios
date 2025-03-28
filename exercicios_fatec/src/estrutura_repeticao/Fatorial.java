/*
	Nome do programa: Fatorial
	Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 09/02/2025
	Exercicio 32
*/

package estrutura_repeticao;

import java.util.Scanner;

public class Fatorial {
	
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int num, i, fat;
		
		
		System.out.print("Digite um número para fazer o fatorial: ");
		num = ler.nextInt();
		
		fat = num;
		
		ler.close();
		
		for(i=num-1; i>0; i--) {
			fat = fat * i; 
		}
	
		System.out.println("O fatorial de " + num + " é " + fat);
		
		
	}

	
}
