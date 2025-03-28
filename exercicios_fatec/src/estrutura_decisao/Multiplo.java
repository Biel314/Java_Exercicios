/*
	Nome do programa: Multiplo
	Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
	do menor.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/02/2025
	Exercicio 26
*/

package estrutura_decisao;

import javax.swing.JOptionPane;

public class Multiplo {

	public static void main(String [] args) {
		int v1, v2;
		
		v1 = Integer.parseInt(JOptionPane.showInputDialog("DIgite o primeiro valor: "));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
	
		if (v1 >= v2) {
			if (v1 % v2 == 0) {
				JOptionPane.showMessageDialog(null, v1 + " é multiplo de " + v2);
			} else {
				JOptionPane.showMessageDialog(null, v1 + " não é multiplo de " + v2);
			}
		} else {
			if (v2 % v1 == 0) {
				JOptionPane.showMessageDialog(null, v2 + " é multiplo de " + v1);
			} else {
				JOptionPane.showMessageDialog(null, v2 + " não é multiplo de " + v1);
			}
		}
	}

}
