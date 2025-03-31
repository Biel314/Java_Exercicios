/*
	Nome do programa: SubtraiSequencia
	Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo: 
	10 
	∑ (A[1] – A[21–1])
	i = 1
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 30/03/2025
	Exercicio 50
*/

package estrutura_vetor_matriz;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class SubtraiSequencia {

	public static void main (String [] args) {
		int[] v = new int[20];
		int opc;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: "));
			
			switch(opc) {
				case 1:
					v = fCarregarVetor(v);
					break;
				case 2:
					pSequencia(v);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Fim do programa");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Invalida!");
					break;
			}
		
		} while (opc != 9);
		
		
	}
	
	public static int[] fCarregarVetor (int[] v) {
		int i=0;
		
		do {
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "a valor do vetor: "));
			
			i++;
		} while(i<20);
		
		System.out.print(Arrays.toString(v));
		
		return v;
	}	
	
	public static void pSequencia (int[] v) {
		int i, r=0, j;
		
		j=20-1;
		
		for (i=0; i<10; i++) {
			r += (v[i] - v[j]);
			/*	r = r + (v[i] - v[j]); */
			
			j--;
		}

		JOptionPane.showMessageDialog(null, "O valor da sequencia é: " + r);
	}
	
	
}

