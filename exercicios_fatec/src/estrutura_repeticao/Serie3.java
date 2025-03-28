/*
	Nome do programa: Serie3
	Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 42
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Serie3{
	
	public static void main(String args[]){
		double n, r=1, i, x = 1, j = 1;
		
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
		
		if(n!=1) {
			for(i=1;i<n;i++){
			
				x++;
			
				j = j + 2;
			
				r+=(x/j);
			}
		 } else {
			 
			 r=1;
		}
		
		JOptionPane.showMessageDialog(null, "O resultado da serie é: " + r);
	}
}