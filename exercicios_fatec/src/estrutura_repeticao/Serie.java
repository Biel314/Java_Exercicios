/*
	Nome do programa: Serie
	Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 09/02/2025
	Exercicio 33
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Serie {

	public static void main(String[] args) {
		double i, num, r=0;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para a sequencia: "));
		
		if (num > 0) {
			for (i=1; i<=num; i++) {
				r = (r+(1/i));
			}
		
			JOptionPane.showMessageDialog(null, "O resultado da sequencia é: " + r);
		} else {
			JOptionPane.showMessageDialog(null, "Não pode ser menor que zero!");
		}
	}

}
