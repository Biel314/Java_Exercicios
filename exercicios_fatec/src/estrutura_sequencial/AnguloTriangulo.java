
/*
   Nome do programa: AngulosTriangulo
   Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 14
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class AnguloTriangulo {

	public static void main(String[] args) {
		int ang1, ang2, ang3;
		
		ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro angulo do triangulo: "));
		ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo angulo do triangulo: "));
		
		ang3 = 180 - (ang1 + ang2);
		
		if(ang3 < 1 ) {
			JOptionPane.showMessageDialog(null, "O resultado dará 0 ou um angulo negativo, ou seja, não é permitido!");
		}
		else {
			JOptionPane.showMessageDialog(null, "O terceiro angulo do triangulo é: " + ang3);
		}
	}

}
