/*
	Nome do programa: Serie4
	Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 45
*/


package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Serie4 {
	
	public static void main (String [] args) {
		double r = 1, i;
		
		for (i = 2; i <= 15; i++) {
			if (i % 2 == 0) {
				r = r - (i / (i*i));
				
			} else {
				r = r + (i / (i*i));
				
			}
		}
		
		JOptionPane.showMessageDialog(null ,"O resultado da serie é: " + r);
	}
	
	
	
}
