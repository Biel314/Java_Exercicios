/*
   Nome do programa: CalculoIdade
   Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e 
   quantos anos terá daqui a 17 anos.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 12
*/

package estrutura_sequencial;

import javax.swing.JOptionPane;

public class CalculaIdade {

	public static void main(String[] args) {
		int anoNasc, anoAtual, idade;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		idade = anoAtual - anoNasc;
		
		JOptionPane.showMessageDialog(null, "A idade é: " + idade);
		
		idade = idade + 17;
		
		JOptionPane.showMessageDialog(null, "Daqui a 17 anos está pessoa terá: " + idade);

	}

}
