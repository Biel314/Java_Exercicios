/*
   Nome do programa: RaizesReais
   Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
   Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 5
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class RaizesReais {

	public static void main(String[] args) {
		double a, b, c, raiz1, raiz2, delta;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor C: "));
		
		delta = ((b*b)-(4*a*c));
		
		JOptionPane.showMessageDialog(null, "O resultado de delta é: " + delta);
		
		raiz1 =((-b + Math.sqrt(delta)) / (2 * a));
		raiz2 =((-b - Math.sqrt(delta)) / (2 * a));
		
		JOptionPane.showMessageDialog(null, "A primeira raiz é: " + raiz1);
		JOptionPane.showMessageDialog(null, "A segunda raiz é: " + raiz2);
	}

}
