/*
	Nome do programa: Dados7
	Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
	resultado 7.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 41
*/

package estrutura_repeticao;

public class Dados7 {
	
	public static void main (String [] args) {
		int i, j, d1, d2;
		
		System.out.println("As possibilidades de somar dois dados e dar 7 �:");
		
		for (i = 1; i <= 6; i++) {
			for (j = 6; j >= 1 ; j--) {
				if (i + j == 7) {
					System.out.println(i + " + " + j + " = " + 7);
				}
			}
		}
		
		d1 = (int) (Math.random() * 6) + 1;
		d2 = (int) (Math.random() * 6) + 1;
		
		if (d1 + d2 == 7) {
			System.out.println("Exemplo: " + d1 + " + " + d2 + " = " + 7);
		}
	}

	
}
