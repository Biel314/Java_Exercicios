/*
	Nome do programa: Serie2
	Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 09/02/2025
	Exercicio 36
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Serie2 {

	public static void main(String[] args) {
		int n, fat, i, j;
		double r=0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		i = n-1;
		
		if (n>0) {
			for (j=1; j<=n; j++) {
				fat = 1;
				i = j;
				
				while (i>0) {
					fat = fat * i;
					
					i--;
				}

				r = (r + (1.0/fat));
			}
			
			JOptionPane.showMessageDialog(null, "O resultado da sequencia é: " + r);
		} else {
			
			JOptionPane.showMessageDialog(null, "Não pode ser menor que zero!");
		}
		
	}

}
