package estrutura_recursiva;

import javax.swing.JOptionPane;

public class Soma {

	public static void main (String [] args) {
		int n, r;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		r = fSoma(n);
		
		JOptionPane.showMessageDialog(null, "A soma dos numeros entre 1 e " + n + " é: " + r);
	}
	
	public static int fSoma (int n) {
		int r;
		
		if (n>1) {
			
			r = n + fSoma(n-1);
			
			return r;
		} else {
			return n;
		}
	}
	

}
