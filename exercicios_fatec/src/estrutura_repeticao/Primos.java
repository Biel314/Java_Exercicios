
/*
	Nome do programa: Primos
	Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos
	existentes entre eles.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 40
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Primos {

public static void main (String [] args) {
	int n1, n2, aux;
	
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero menor: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero maior: "));
	
	if (n1 > n2) {
		aux = n1;
		n1 = n2;
		n2 = aux;
		
		System.out.println("Está erradoo! Arrumamos pra vc!");
	}
	
	pPrimos(n1, n2);
	
}

public static void pPrimos(Integer min, Integer max) {
	int i, j;
	
	for (i = min + 1; i < max; i++) {
		if (i == 1 || i == 2) {
			System.out.println(i);
			
		} else {
			for (j = 2; j < max; j++) {
				if (((i % j) == 0) && (i != j)) {
					
					break;
				} else if (i == j) {
					
					System.out.println(i + " ");
				}
			}
			
		}
		
	}
	
}



}
