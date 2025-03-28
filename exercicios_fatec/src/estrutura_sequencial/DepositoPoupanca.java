
/*
   Nome do programa: DepositoPoupanca
   Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor 
   após 1 mês de aplicação sabendo que rende 1,3% a. m.
   Nome do Programador: Gabriel Ordonho
   Data de desenvolvimento: 16/02/2025
   Exercicio 8
*/


package estrutura_sequencial;

import javax.swing.JOptionPane;

public class DepositoPoupanca {

	public static void main(String[] args) {
		double deposito, poupanca, rend;
		int i=1;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("DIgite o dinheiro a ser depositado: "));
		
		poupanca = (deposito+(deposito*0.013));
		rend = deposito*0.013;
		
		JOptionPane.showMessageDialog(null, "No primeiro mês você terá um rendimento de: " + poupanca);
		
		/*(EXTRA) Rendimento em 1 ano */
		while (i<=12) {
			deposito = deposito + rend;
			System.out.println("Rendimento no " + i + " mes é de: " + deposito);
			System.out.println("");
			i++;
		}

	}

}