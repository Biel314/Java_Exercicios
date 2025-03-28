
/*
	Nome do programa: GraosTabuleiro
	Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
	Casa: 1 2 3 4 ... 64
	Qte: 1 2 4 8 ... N

	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 39
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class GraosTabuleiro {
	
	public static void main (String [] args) {
		int cs;
		
		cs = Integer.parseInt(JOptionPane.showInputDialog("Digite a casa maxima do tabuleiro: "));
		
		int[] graos = new int[cs];
		
		for (int i = 0; i < cs; i ++) {
			graos[i] = fPotencia(2, i);
		
			System.out.println(" " + graos[i]);
		}
	}

	public static int fPotencia(Integer base, Integer expoente) {
		int r;
		
		r = 1;
		
		for (int i = 0; i < expoente; i++) {
			if (expoente == 0) {
				
				return 1;
			} else {
				r = r * base;

			}
			
		}
		
		return r;
	}
	
	
}