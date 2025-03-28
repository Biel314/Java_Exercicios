/*
	Nome do programa: Tabuada
	Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 09/02/2025
	Exercicio 34
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		double n, r;

		n = Double.parseDouble(JOptionPane.showInputDialog("Digite o número que deseja ver a tabuada: "));
	
		for (int i = 0; i<=10; i++ ) {
			r = n * i;
			System.out.println(n + " * " + i +" = " + r);
		}
	}

}
