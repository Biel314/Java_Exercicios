/*
   Nome do programa: maiorDouble
   Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 27/02/2025
   Exercicio 19
*/

package estrutura_decisao;

import javax.swing.JOptionPane;

public class MaiorDouble {
	public static void main(String[] args) {
		double v1, v2;

		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		if(v1 > v2) {
			JOptionPane.showMessageDialog(null, "O maior valor é " + v1);
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior valor é " + v2);
		}
	}

}
