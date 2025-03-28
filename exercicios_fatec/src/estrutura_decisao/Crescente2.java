/*
	Nome do programa: Crescente2
	Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
	necessariamente em ordem. Mostre os 4 números em ordem crescente.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/02/2025
	Exercicio 23
*/

package estrutura_decisao;

import javax.swing.JOptionPane;

public class Crescente2 {
	public static void main(String[] args) {
		int v1, v2, v3, v4, aux;

		JOptionPane.showMessageDialog(null, "Digite os primeiros 3 valores em ordem crescente (do menor pro maior)");
		
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
		
		if (v1 <= v2 && v2 <= v3) {
			v4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor: "));
			
			if (v4 <= v1) {
				aux = v1;
				v1 = v4;
				v4 = v2;
				v2 = aux;
				aux = v3;
				v3 = v4;
				v4 = aux;
			}
			
			if (v4 <= v2) {
				aux = v2;
				v2 = v4;
				v4 = v3;
				v3 = aux;	
			} 
			
			if (v4 <= v3) {
				aux = v3;
				v3 = v4;
				v4 = aux;
			} 
			
			JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + v1 + ", " + v2 + ", " + v3 + " e " + v4);
		}
		else {
			JOptionPane.showMessageDialog(null, "Um dos primeiros 3 valores não está em ordem crescente!");
		}
		
	}
}
