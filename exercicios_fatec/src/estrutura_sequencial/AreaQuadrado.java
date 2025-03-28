
/*
   Nome do programa: AreaQuadrado
   Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 1
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class AreaQuadrado {
	public static void main (String [] args) {
		
		double lado, area;
		
	lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
	
	area = lado * lado;
	
	JOptionPane.showMessageDialog(null, "A area do quadrado é: " + area);
		
	}
}
