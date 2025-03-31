/*
	Nome do programa: BubbleSort
	Objetivo: Criar e coletar em um vetor [20] com números aleatórios. Classificar este 
	vetor em ordem crescente e mostre os dados. 
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 30/03/2025
	Exercicio 51
*/

package estrutura_vetor_matriz;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class BubbleSort {

	public static void main (String [] args) {
		int opc;
		int[] v = {12, 99, 10, 63, 12, 63, 1, 155, 21, 33, 6, 23, 87, 84, 15, 15, 201, 521, 95, 49};
		int[] crescente = new int[20];
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: "));
			
			/* Treinamento */

			switch(opc) {
			case 1:
				crescente = fClassificaCrescente(v);
				break;
			case 2:
				pMostra(crescente);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim do programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida!");
				break;
			} 
			
		} while(opc != 9);
		
	}
	
	/* Função que ordena um vetor em ordem crescente */

	public static int[] fClassificaCrescente (int[] v) {
		int i, j, aux, tam;
		
		tam = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas casas tem o vetor: "));
		
		for (i=0; i<tam; i++) {
			for (j=i+1; j<tam; j++) {
				if (v[i]>v[j]) {
					aux = v[j];
					v[j] = v[i];
					v[i] = aux;
				}
			}
		}
		
		return v;
	}
	
	/* Procedure especialmente criada para treino */

	public static void pMostra(int[] crescente) {
		JOptionPane.showMessageDialog(null, "O vetor após a ordenação!");
		JOptionPane.showMessageDialog(null, Arrays.toString(crescente));
	}
	
}
