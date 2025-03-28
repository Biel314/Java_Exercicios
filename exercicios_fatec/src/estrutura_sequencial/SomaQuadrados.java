/*
   Nome do programa: SomaQuadrados
   Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 9
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class SomaQuadrados {

	public static void main (String [] args) {
		int n1, n2, somaQuadrados;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		somaQuadrados = ((n1 * n1) + (n2 * n2));
		
		JOptionPane.showMessageDialog(null, "A soma dos quadrados desses números é: " + somaQuadrados);
	}
}