/*
	Nome do programa: Investimento
	Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do]
	investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
	poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 09/02/2025
	Exercicio 29
*/

package estrutura_repeticao;

import javax.swing.JOptionPane;

public class Investimento {

	public static void main(String[] args) {
		int tipo, i=1;
		double valor, poup, rend;
		
		tipo = Integer.parseInt(JOptionPane.showInputDialog("(Digite 1 = para Poupança /// 2 = para Renda Fixa)"));
		
		if (tipo == 1 || tipo == 2) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja investir: "));
			
			if (tipo == 1) {
				poup = valor;
				while (i <= 30) {
					valor = (valor * 1.03);
					i++;
				}
				poup = valor - poup;
				
				JOptionPane.showMessageDialog(null, String.format("Rendimento após um mês: %.2f", poup));
			}
			if (tipo == 2) {
				rend = valor;
				while (i <= 30) {
					valor = (valor * 1.05);
					i++;
				}
				rend = valor - rend;
				
				JOptionPane.showMessageDialog(null, String.format("Rendimento após um mês: %.2f", rend));
			}
			
			JOptionPane.showMessageDialog(null, String.format("Valor total após um mês: %.2f", valor));
		} else {
			
			JOptionPane.showMessageDialog(null, "Opção não existente, por favor selecione 1 ou 2!");
		}
	}

}