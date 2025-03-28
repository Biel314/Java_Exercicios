/*
	Nome do programa: velocidadeMedia
	Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
	duração (minutos). Calcule e mostre a velocidade média em km/h.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/02/2025
	Exercicio 27
*/


package estrutura_decisao;

import javax.swing.JOptionPane;

public class velocidadeMedia {

	public static void main(String[] args) {
		double circuito, velocMedia, numVolta, duracao;
		
		circuito = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros: "));
		duracao = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duracao: "));
		numVolta = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas: "));
		
		if (numVolta > 0) {
			
			circuito = circuito / 1000;
			duracao = duracao / 60;
			
			velocMedia = ((circuito*numVolta)/duracao);
			
			JOptionPane.showMessageDialog(null, "A velocidade média em km/h é: " + velocMedia);
		} else {
			JOptionPane.showMessageDialog(null, "Não deu nenhuma volta!");
		}
	}

}
