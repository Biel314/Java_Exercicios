/*
	Nome do programa: DuracaoJogo
	Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
	tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
	Nome do Programador: Gabriel Ordonho
	Data de desenvolvimento: 27/02/2025
	Exercicio 25
*/

package estrutura_decisao;

import javax.swing.JOptionPane;

public class DuracaoJogo {
	
	public static void main(String [] args) {
		int inicioHora, inicioMin, fimHora, fimMin, duracaoHora, duracaoMin;
		
		inicioHora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora em que o jogo começou: "));
		inicioMin = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos em que o jogo começou: "));
		
		fimHora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora em que o jogo acabou: "));
		fimMin = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos em que o jogo acabou:"));
		
		if (inicioHora >= 0 && fimHora >= 0 && inicioHora < 24 && fimHora < 24) {
			if ( inicioMin >= 0 && fimMin >= 0 && inicioMin < 60 && fimMin < 60) {
				inicioHora = inicioHora * 60;
				inicioHora = inicioHora + inicioMin;
				
				fimHora = fimHora * 60;
				fimHora = fimHora + fimMin;
				
				if (inicioHora > fimHora) {
	 				fimHora = fimHora + (24*60);
				} 
				duracaoHora = ((Math.abs(fimHora - inicioHora))/60);
				duracaoMin = ((Math.abs(fimHora - inicioHora))%60);
				
				JOptionPane.showMessageDialog(null, "O tempo do jogo foi: " + duracaoHora + " horas e " + duracaoMin + " minutos");
			} else {
				JOptionPane.showMessageDialog(null, "Os minutos de inicio e/ou fim estão errados!");
			}
		} else {
				JOptionPane.showMessageDialog(null, "As horas de inicio e/ou fim estão erradas!");
		}
	}

}