/*
	Nome do programa: MediaNota
	Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
	Mostre a mensagem de acordo com a média:
	a. Se a média for >= 6,0 exibir “APROVADO”;
	b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
	c. Se a média for < 3,0 exibir “RETIDO”.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/02/2025
	Exercicio 21
*/

package estrutura_decisao;

import javax.swing.JOptionPane;

public class MediaNota {
	public static void main (String [] args) {
		double n1, n2, n3, n4, media;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
		
		media = ((n1 + n2 + n3 + n4)/4);
		
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "nota: " + media + ", está aprovado!");
		} else if (media >= 3 && media < 6) {
			JOptionPane.showMessageDialog(null, "nota: " + media + ", precisará fazer um exame!");
		} else {
			JOptionPane.showMessageDialog(null, "nota: " + media + ", está retido!");
		}
	}
}