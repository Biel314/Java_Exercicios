package estrutura_recursiva;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main (String [] args) {
		int n, r;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		r = fFatorial(n);
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é " + r);
	}
	
	public static int fFatorial(int n) {
		int fat;
		
		if (n>1) {
			fat = (n * fFatorial(n-1));
			
			return fat;
		} else {

			return n;
		}
		
	}
	
}
