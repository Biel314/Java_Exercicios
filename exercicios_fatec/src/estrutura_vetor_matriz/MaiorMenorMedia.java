/*
	Nome do programa: MaiorMenorMedia 
	Objetivo: Criar e coletar um vetor [100] inteiro e exibir: 
	a. O maior e o menor valor; 
	b. A média dos valores. 
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 29/03/2025
	Exercicio 47
*/

package estrutura_vetor_matriz;

import javax.swing.JOptionPane;

public class MaiorMenorMedia {
	
	public static void main (String [] args) {
			int[] v = new int[100];
		
			v = fCarregarVetor(v);
			
			pBubbleSort(v);
			
			pMediaVetor(v);
			
	}
	
	public static int[] fCarregarVetor (int[] v) {
		
		int i;
		
		for (i=0; i<100; i++) {
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) +"o valor do vetor: "));
		}
		
		return v;
	}
	
	public static void pBubbleSort(int[] v) {
		int i, j, aux;
		
		for (i=0; i<100; i++) {
			for (j=i+1; j<100; j++) {
				if (v[i] > v[j]) {
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				} 
			}
		}
		
		System.out.println("O menor valor do vetor é: " + v[0]);
		System.out.println("O maior valor do vetor é: " + v[99]);
	}
	
	public static void pMediaVetor(int[] v) {
		int i, soma=0;
		double media;
		
		for (i=0; i<100; i++) {
			soma = soma + v[i];
		}
		
		media = soma/100f;
		System.out.println(soma);
		System.out.println("A media de todos os valores do vetor é: " + media);
		
	}
	
	
	
}
