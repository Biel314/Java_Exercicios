package estrutura_vetor_matriz;

public class Matriz {

	public static void main (String [] args) {
		int[][] arr = new int[8][8];
		int i, j, exp=0;
		
		for (i=0; i<8; i++) {
			for (j=0; j<8; j++) {
				arr[i][j] = fPotencia(exp);
				exp++;
			}
		}
		
		for (i=0; i<8; i++) {
			for (j=0; j<8; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
	}
	
	public static int fPotencia(int exp) {
		int r=2, i=1;
		
		if (exp == 0) {
			r = 1;
		} else {
			while (i<exp) {
				r = r * 2;
				i++;
			}
		}
		return r;
	}
	
	
}
