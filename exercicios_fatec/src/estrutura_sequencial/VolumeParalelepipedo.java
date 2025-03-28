/*
   Nome do programa: VolumeParalelepipedo
   Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo.
   Calcule e mostre seu volume
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 7
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class VolumeParalelepipedo {

	public static void main (String [] args) {
		double c, l, h, v;
		
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepipedo: "));
		l = Integer.parseInt(JOptionPane.showInputDialog("Digite o largura do paralelepipedo: "));
		h = Integer.parseInt(JOptionPane.showInputDialog("Digite o altura do paralelepipedo: "));
		
		v = (c*l*h);
		
		JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é: " + v);
	}
}
