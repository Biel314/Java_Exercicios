/*
	Nome do programa: Crescente
	Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/02/2025
	Exercicio 22
*/

package estrutura_decisao;

import javax.swing.JOptionPane;

public class Crescente {
	public static void main(String[] args) {
		int v1, v2;
		
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		if (v1 == v2) {
			JOptionPane.showMessageDialog(null, "Os valores tem que ser diferentes.");
		} else if (v1 < v2) {
			JOptionPane.showMessageDialog(null, "Os valores em ordem crescente ficam: " + v1 + ", " + v2);
		} else {
			JOptionPane.showMessageDialog(null, "Os valores em ordem crescente ficam: " + v2 + ", " + v1);
		}
		
	}
}
