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
		int opc, r=0;
		int[] arr = {12, 99, 10, 63, 12, 63, 1, 155, 21, 33, 6, 23, 87, 84, 15, 15, 201, 521, 95, 49};
		int[] ord = new int[20];
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: "));
			
			/* Treinamento */

			switch(opc) {
			case 1:
				ord = fClassificaCrescente(arr);
				break;
			case 2:
				pOrdenacao(ord);
				break;
			case 3:
				r = fPesquisaBinaria(ord);
				break;
			case 4:
				pResultado(ord, r);
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

	public static int[] fClassificaCrescente (int[] arr) {
		int i, j, aux;

		for (i=0; i<20; i++) {
			for (j=i+1; j<20; j++) {
				if (arr[i]>arr[j]) {
					aux = arr[j];
					arr[j] = arr[i];
					arr[i] = aux;
				}
			}
		}
		
		return arr;
	}

	public static void pOrdenacao(int[] arr) {
		JOptionPane.showMessageDialog(null, Arrays.toString(arr));
	}
	
	public static int fPesquisaBinaria(int[] v) {
		int m, esq=0, dir=19, num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser buscado: "));
		
		 while (esq <= dir) {
	            m = esq + (dir - esq) / 2;
	            
	            if (v[m] == num) {
	                return m;
	            }
	            
	            if (v[m] < num) {
	                esq = m + 1;
	            } else {
	                dir = m - 1; 
	            }
	        }
	        
	        return -1;
		
	}
	
	
	public static void pResultado(int[] arr ,int r) {
		
		if (r != -1) {
			JOptionPane.showMessageDialog(null, "O valor procurado é: " + r);
			
		} else {
			JOptionPane.showMessageDialog(null, "Não existe este valor dentro do vetor");
			
		}
			
		
		
	}
	
	
}
