/*
   Nome do programa: ReajusteSalario
   Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 2
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class ReajusteSalario {

	public static void main (String [] args) {
		double salario, reajuste;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
		
		reajuste = (salario * 1.15);
		
		JOptionPane.showMessageDialog(null, String.format("O reajuste é de: %.2f", reajuste));
		
	}
}
