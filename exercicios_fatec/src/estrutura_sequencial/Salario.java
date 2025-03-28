/*
   Nome do programa: Salario
   Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
   de desconto e o número de descendentes. Calcule o salário que serão as
   horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
   Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
   Líquido. Exiba o salário a receber.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 16
*/


package estrutura_sequencial;

import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {
		double sBruto, sLiquido, valorHora, desc;
		int hTrabalho, descendentes;
		
		hTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por horas ganho: "));
		desc = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
		descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de descendentes: "));
		
		sBruto = hTrabalho * valorHora;
		sLiquido = (sBruto - (sBruto * (desc / 100)));
		
		sLiquido = ((descendentes * 100) + sLiquido);
		
		JOptionPane.showMessageDialog(null, "O salario liquido final é: " + sLiquido);

	}

}
