
/*
   Nome do programa: LitrosGastos
   Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel 
   faz 12 km/l. Receber o tempo de percurso e a velocidade média.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 17
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class LitrosGastos {

	public static void main(String[] args) {
		double tPercurso, velocMedia, qtdLitros, d;
		
		tPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percurso: "));
		velocMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média: "));
		
		d = (tPercurso * velocMedia);
		 
		qtdLitros = (d / 12);
		
		JOptionPane.showMessageDialog(null, String.format("A quantidade de litros gastos em uma viagem é de: %.2f", qtdLitros));
	}

}
