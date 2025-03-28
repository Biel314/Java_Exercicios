/*
	Nome do programa: Potencia
	Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da
	potência.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 44
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Potencia {

	public static void main(String[] args) {
		int r=1, expo, base;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
		expo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente: "));
		
		if (expo == 0) {
			JOptionPane.showMessageDialog(null, "A potencia de " + base + " elevado a " + expo + " é: " + 1);
		} else {
			for (int i = 0; i < expo; i++) {
				
					r = r * base;
			}
			JOptionPane.showMessageDialog(null, "A potencia de " + base + " elevado a " + expo + " é: " + r);
		}
	}

	
	
}
