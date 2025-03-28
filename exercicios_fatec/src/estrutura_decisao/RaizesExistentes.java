
/*
   Nome do programa: RaizesExistentes
   Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
   AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
   exista, calcule e mostre.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 27/02/2025
   Exercicio 20
*/


package estrutura_decisao;

import javax.swing.JOptionPane;

public class RaizesExistentes {
	public static void main (String [] args) {
		double a, b, c, delta, raiz1, raiz2;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
		
		delta = (Math.sqrt((b*b) - (4 * a * c)));
		
		if (delta == 0) {
			raiz1 = ((-b + delta)/(2*a));
			
			JOptionPane.showMessageDialog(null, "Possui uma raiz! O resultado é: " + raiz1);
			
		} else if (delta > 0) {
			raiz1 = ((-b + delta)/(2*a));
			raiz2 = ((-b - delta)/(2*a));
			
			JOptionPane.showMessageDialog(null, "Possui duas raizes! O resultado da primeira raiz é: " + raiz1 + " e a segunda raiz é: " + raiz2);
		
		} else {
			JOptionPane.showMessageDialog(null, "O delta é negativo, logo não existe raiz!");
		
		}
		
	}
	
}