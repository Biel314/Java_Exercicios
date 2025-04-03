package estrutura_recursiva;

import javax.swing.JOptionPane;

public class Potencia {

	public static void main (String [] args) {
		int k, n, r;
		
		k = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
		
		if (k != 0 && n == 0) {
			r=1;
			
			System.out.println("O resultado é: " + r);
		} else if (k == 0 && n == 0) {
			
			System.out.println("Indeterminado!!");
		} else {
			r = fPotencia(k, n);
			
			System.out.println("O resultado é: " + r);
		}
		
	}
	
	public static int fPotencia (int k, int n) {
		int r;
		
		if (n>1) {
			
			r = k * fPotencia(k, n-1);
			
			return r;
		}
		
		return k;
	}
	
	
	
	
}
