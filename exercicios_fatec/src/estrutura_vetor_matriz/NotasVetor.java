/*
	Nome do programa: NotasVetor
	Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir: 
	a. A média do grupo; 
	b. A quantidade de notas acima da media do grupo; 
	c. As posições dos valores abaixo da média do grupo. 
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 29/03/2025
	Exercicio 49
*/


package estrutura_vetor_matriz;

import javax.swing.JOptionPane;

public class NotasVetor {

	public static void main (String [] args) {
		int[] v = new int[30];
		double media;
		
		v = fCarregarVetor(v);
		
		media = fMediaNotas(v);
		pNotasAcimaAbaixo(v, media);
	}
	
	public static int[] fCarregarVetor(int[] v) {
		int i;
		
		for (i=0; i<30; i++) {
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da nota da " + (i+1) + "a posição do vetor: "));
		}
		
		return v;
	}
	
	public static double fMediaNotas(int[] v) {
		int i;
		double media, soma=0;
		
		for (i=0; i<30; i++) {
			soma = soma + v[i];
		}
		
		media = soma/30f;
		JOptionPane.showMessageDialog(null ,"A media de todos as notas é: " + media);
		
		return media;
	}
	
	public static void pNotasAcimaAbaixo(int[] v, double media) {
		int i, j=0;
		
		for (i=0; i<30; i++) {
			if(v[i] > media) {
				j++;
			} else {
				System.out.println("Posição que está abaixo da media: " + i);
			}
		}
		
		if(j!=0) {
			JOptionPane.showMessageDialog(null, "A quantidade de alunos com nota acima da media do grupo é: " + j);
		} else {
			JOptionPane.showMessageDialog(null, "Ninguém do grupo possui notas acima da media do próprio grupo!");
		}
		
	}
	
	
}