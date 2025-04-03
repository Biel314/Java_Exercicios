package estrutura_vetor_matriz;

public class Diagonal {

	public static void main (String [] args) {
		int[][] v = new int[4][4];
		int i, j;
		
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
				if (i == j) {	
					v[i][j] = (int) Math.pow(4, j);	
				}
			}
		}
		
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
				System.out.print(v[i][j] + " ");
			}
		}
		
	}
	
}
