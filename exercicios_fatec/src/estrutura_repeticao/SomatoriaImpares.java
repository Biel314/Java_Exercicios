/*
	Nome do programa: SomatoriaImpares
	Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
	mostre o resultado da somatória dos números ímpares entre esses valores.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 09/02/2025
	Exercicio 35
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class SomatoriaImpares {
	
	public static void main (String [] args) {
		int n1, n2, r=0, i;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
	
		if (n1 > n2) {
			i=n2;
			while (i<n1) {
				if(i%2 != 0) {
					r = r + i;
				}
				
				i++;
			}
		} else {
			i=n1;
			while (i<n2) {
				if (i%2 != 0) {
					r = r + i;
				}
				
				i++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O resultado da somatoria dos num impares é: " + r);
	}
}
