/*
	Nome do programa: CheckProdutos
	Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos 
	vendidos em 4 semanas. Calcular e exibir: 
	a. A quantidade de cada produto vendido no mês; 
	b. A quantidade de produtos vendidos por semana; 
	c. O total de produtos vendidos no mês. 
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 30/03/2025
	Exercicio 52
*/

package estrutura_vetor_matriz;

//import java.util.Arrays;

import javax.swing.JOptionPane;

public class CheckProdutos {
	
	public static void main (String [] args) {
		int opc;
		int[][] produtos = new int[4][3];
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções, caso deseje encerrar digite 9"));
			
			switch(opc) {
			case 1:
				produtos = fCarregaProduto(produtos);
				break;
			case 2:
				pQtdVendidaMes(produtos);
				break;
			case 3:
				pQtdVendidaSemana(produtos);
				break;
			case 4:
				pQtdTotal(produtos);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim do programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!");
				break;
			}
			
		} while (opc != 9);
		
		
	}
	
	public static int[][] fCarregaProduto(int[][] arr) {
		int i, j;
		
		for (i=0; i<4; i++) {
			for (j=0; j<3; j++) {
				arr[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto " + (j+1) + " da " + (i+1) + "a semana"));
			}
		}
		
		for (i=0; i<4; i++) {
			System.out.println(" ");
			System.out.print((i+1) + " semana = ");
			for (j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
		//System.out.print(Arrays.deepToString(arr)); 
		
		return arr;
	}
	
	public static void pQtdVendidaMes(int[][] produtos) {
		int i, j, soma=0;
		
		for (j=0; j<3; j++) {
			for (i=0; i<4; i++) {
				soma += produtos[i][j];
			}
			JOptionPane.showMessageDialog(null, "Foram vendidas " + soma + " quantidades do produto " + (j+1) + " no mês");
			soma = 0;
		}
	}
	
	public static void pQtdVendidaSemana(int[][] produtos) {
		int i, j, soma=0;
		
		for (i=0; i<4; i++) {
			for (j=0; j<3; j++) {
				soma += produtos[i][j];
			}
			JOptionPane.showMessageDialog(null, "Foram vendidas " + soma + " quantidades dos produtos na " + (i+1) + " semana");
			soma = 0;
		}
	}
	
	public static void pQtdTotal(int[][] produtos) {
		int i, j, soma=0;
		
		for (j=0; j<3; j++) {
			for (i=0; i<4; i++) {
				soma += produtos[i][j];
			}
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade total vendida no mês é de " + soma + " produtos");
	}
	
}
