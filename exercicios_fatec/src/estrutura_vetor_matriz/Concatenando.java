/*
	Nome do programa: Concatenando
	Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar 
	esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex: 
	|VT1| 1| 2| 3| 
	|VT2| 4| 5| 6| 
	|VT3| 1| 2| 3| 4| 5| 6 |
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 29/03/2025
	Exercicio 48
*/

package estrutura_vetor_matriz;

import java.util.Arrays;

public class Concatenando {

	public static void main (String [] args) {
		int[] v1 = {1, 2, 3};
		int[] v2 = {4, 5, 6};
		int[] v3 = new int[6];
		
		int i;
		
		for (i=0; i<6; i++) {
			if (i<3) {
				v3[i] = v1[i];
			} else {
				v3[i] = v2[i-3];
			}
		}
		
	/*
		for (i=0; i<3; i++) {
			v3[i] = v1[i];
			v3[i+3] = v2[i];
		}
	*/
		
	     System.out.println(Arrays.toString(v3));
		
	}
	
	
}
