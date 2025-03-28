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
		int num, i, fat;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número para fazer o fatorial: ");
		num = in.nextInt();
		
		fat = num;
		
		for(i=num-1; i>0; i--) {
			fat = fat * i; 
		}
	
		System.out.println("O fatorial de " + num + " é " + fat);
		
		in.close();
	}

	
}
