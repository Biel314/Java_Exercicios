/*
	Nome do programa: CalcularImpares
	Objetivo: Criar e coletar um vetor [50] inteiro. Calcular e exibir: 
	a. A média dos valores entre 10 e 200; 
	b. A soma dos números ímpares. 
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 29/03/2025
	Exercicio 46
*/

package estrutura_vetor_matriz;

import javax.swing.JOptionPane;

public class CalcularImpares {

	public static void main (String [] args) {
		int[] v = new int[50];
	
		v = fCarregar(v);
		
		pMediaValor(v);
		
		pSomaImpares(v);
	}
	
	public static int[] fCarregar (int[] v) {
		int i;
		
		for (i=0; i<50; i++) {
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "a valor do vetor: "));
		}
		
		return v;
	}
	
	
	public static void pMediaValor(int[] v) {
		double media, soma=0, count=0.0;
		int i;
		
		for (i=0; i<50; i++) {
			if (v[i] > 10 && v[i] < 200) {
				soma = soma + v[i];
			
				count++;
			}
		}
		if (count != 0) {
			media = soma/count;
			JOptionPane.showMessageDialog(null, "A media de todos os valores entre 10 e 200 do vetor é: " + media);
			
		} else {
			JOptionPane.showMessageDialog(null, "Não possui valores entre 10 e 200");
		}
		
	}
	
	
	public static void pSomaImpares(int[] v) {
		int i, soma=0;
		
		for (i=0; i<50; i++) {
			if (v[i] % 2 != 0) {
				soma = soma + v[i];
				
			}
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos impares de todos os valores do vetor: " + soma);
		
	}
	
	
}
