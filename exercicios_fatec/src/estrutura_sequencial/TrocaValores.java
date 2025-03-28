/*
   Nome do programa: TrocaValores 
   Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 6
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class TrocaValores {

	public static void main(String[] args) {
		int x, y, a;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		JOptionPane.showMessageDialog(null, "Os valores digitados foram: " + x + " e " + y);
		
		a = x;
		x = y;
		y = a;
		
		JOptionPane.showMessageDialog(null, "Invertido ficam: " + x + " e " + y);
		
	}

}
