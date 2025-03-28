/*
	Nome do programa: Divisivel
	Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/02/2025
	Exercicio 24
*/

package estrutura_decisao;

import javax.swing.JOptionPane;

public class Divisivel {
	public static void main (String [] Args) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		if (num % 2 == 0 && num % 3 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + num + " é divisivel por 2 e 3!");
		} else if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + num + " é divisivel apenas por 2!");
		} else if (num % 3 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + num + " é divisivel apenas por 3!");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + num + " não é divisivel por nenhum dos dois!");
		}
	}
}
