/*
   Nome do programa: DiferencaDouble
   Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 10
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class DiferencaDouble {

	public static void main(String[] args) {
		double n1, n2, dif, aux;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		if (n1 < n2) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		dif = (n1 - n2);
		
		JOptionPane.showMessageDialog(null, String.format("A diferença entre os dois números reais é: %.2f", dif));
		
	}

}
