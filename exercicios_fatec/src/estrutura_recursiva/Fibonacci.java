package estrutura_recursiva;

import javax.swing.JOptionPane;

//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
public class Fibonacci {

	public static void main (String [] args) {
		int n, r;

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		if (n < 0) {
			System.out.println("Este valor não é valido");
		} else {
			r = fFibonacci(n);
			
			JOptionPane.showMessageDialog(null, "Resultado: " + r);
		}
	}
	
	public static int fFibonacci(int n) {
		int r;
		
		if (n>1) {
			r = fFibonacci(n - 1) + fFibonacci(n - 2);
					
			return r;
		} 
		
		return n;
		
	}
	
	
}
