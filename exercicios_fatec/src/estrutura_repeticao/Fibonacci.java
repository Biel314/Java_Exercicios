
/*
	Nome do programa: Fibonacci
	Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N'nésimo termo.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 37
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main (String [] args) {
		int v;
		
		v = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		FfibonacciTabela(v);
	}

	public static void FfibonacciTabela (Integer v) {
		int i, t1, t2, r;
		
		t1 = 0;
		t2 = 1;
		
		for (i = 1; i <= v; i++) {
			r = t1 + t2;
				
			if (i == 1) {
				
				System.out.println(t1 + " ");
			} else if (i == 2) {
				
				System.out.println(t2 + " ");
			} else {
				
				t1 = t2;
				t2 = r;
				
				System.out.println(r + " ");
			}
		}
		
	}
	
}
