/*
   Nome do programa: difMaiorMenor
   Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
   maior pelo menos valor.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 27/02/2025
   Exercicio 18
*/

package estrutura_decisao;

import javax.swing.JOptionPane;

public class DifMaiorMenor {
	public static void main (String [] args) {
		int v1, v2, dif;
		
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		if (v1 > v2) {
			dif = v1 - v2;
			
			JOptionPane.showMessageDialog(null, "A diferença entre " + v1 + " e " + v2 + " é de: " + dif);
		}
		else {
			dif = v2 - v1;
			
			JOptionPane.showMessageDialog(null, "A diferença entre " + v2 + " e " + v1 + " é de: " + dif);
		}
		
	}
}
