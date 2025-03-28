/*
   Nome do programa: Pitagoras
   Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
   a hipotenusa. 
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 15
*/
 
package estrutura_sequencial;

import javax.swing.JOptionPane;

public class Pitagoras {

	public static void main(String[] args) {
		double catAdj, catOp, hip;
		
		catAdj = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto adjascente: "));
		catOp = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto oposto: "));
		
		hip = ((catAdj * catAdj) + (catOp * catOp));
		
		hip = Math.sqrt(hip);
		
		JOptionPane.showMessageDialog(null, "A diferença entre os dois números reais é: " + hip);
	}

}
