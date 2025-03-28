/*
	Nome do programa: MudancaPreco
	Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o 
	novo preço sabendo que:
	  Venda Mensal         Preço Atual        Preço Novo
        < 500                 < 30               +10%
    >= 500 e < 1000      >= 30 e < 80            +15%
       >= 1000               >= 80               -5%
    Obs.: para outras condições, preço novo será igual ao preço atual.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/02/2025
	Exercicio 28
*/


package estrutura_decisao;

import javax.swing.JOptionPane;

public class MudancaPreco {

	public static void main(String[] args) {
		double precoAtual, mediaMensal, precoNovo;
		
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
		mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a media mensal do produto: "));
		
		if (precoAtual > 0 && mediaMensal > 0) {
			if (mediaMensal < 500 && precoAtual < 30) {
				precoNovo = (precoAtual*1.10);
				
				JOptionPane.showMessageDialog(null, "O preço novo é: " + precoNovo);
			} else if (mediaMensal >=500 && mediaMensal < 1000 && precoAtual >=30 && precoAtual < 80) {
				precoNovo = (precoAtual*1.15);
				
				JOptionPane.showMessageDialog(null, "O preço novo é: " + precoNovo);
			} else if (mediaMensal >= 1000 && precoAtual >= 80) {
				precoNovo = (precoAtual - (precoAtual*0.05));
				
				JOptionPane.showMessageDialog(null, "O preço novo é: " + precoNovo);
			} else {
				
				JOptionPane.showMessageDialog(null, "O preço permanece o mesmo");
			}
		} else {
			
			JOptionPane.showMessageDialog(null, "Há erros em algum dos dados fornecidos! ");
		}
	}

}
