
/*
   Nome do programa: Circunferencia
   Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da 
   circunferência.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 11
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class Circunferencia {

	public static void main(String[] args) {
		double raio, c;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
		
		c = (2 * 3.14 * raio);
		
		JOptionPane.showMessageDialog(null, "O valor da circunferencia é: " + c);

	}

}
