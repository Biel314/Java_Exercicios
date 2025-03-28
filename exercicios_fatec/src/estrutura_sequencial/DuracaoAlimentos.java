
/*
   Nome do programa: DuracaoAlimentos
   Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias 
   durará esse alimento sabendo que a pessoa consome 50g ao dia.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 13
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class DuracaoAlimentos {

	public static void main(String[] args) {
		double kgAlimento, dia;
		
		kgAlimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos em kg: "));
		
		dia = ((kgAlimento*1000)/50);
		
		JOptionPane.showMessageDialog(null, "Esta qtd de alimentos durará " + dia + " dias");
	}

}
