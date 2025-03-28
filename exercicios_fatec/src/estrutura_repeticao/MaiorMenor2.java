
/*
	Nome do programa: MaiorMenor2 
	Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos
	valor. Obs.: somente valores positivos.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/03/2025
	Exercicio 38
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class MaiorMenor2 {

public static void main (String [] args) {
	int[] v = new int[10];
	int i, j, aux;
	
	v = fCarregaVetor(v);
	
	// Bubble sort
	for (i = 0; i < 10; i++) {
		for (j = i+1; j < 10; j++) {
			if (v[i] > v[j]) {
				aux = v[i];
				v[i] = v[j];
				v[j] = aux;
			}
		}
	
	}
	
	JOptionPane.showMessageDialog(null, "O maior valor e: " + v[9]);
	JOptionPane.showMessageDialog(null, "O menor valor e: " + v[0]);
	
}

public static int[] fCarregaVetor (int[] v) {
	int i;
	
	for (i=0; i<10; i++) {
		v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "� valor positivo: "));
		
		if (v[i] < 1) {
			System.out.println("Valor Invalido");
			
			i = i - 1;
		}
	}
	
	return v;
}
}
