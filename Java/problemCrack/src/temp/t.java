package temp;

public class t {
	public static void main(String[] args) {
		int z = 16;

		int n = 8;
		int[][] pImg = new int[z][z];

		for (int i = 0; i < z; i++) {
			for (int j = 0; j < z; j++) {
				pImg[i][j] = 1;
			}
		}
		int[][] pImgpix = new int[z][z];

		for (int i = 0; i < z; i++) {
			for (int j = 0; j < z; j++) {
				pImgpix[i][j] = 1;
			}
		}
		int[][] b = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				pImg[i][j] = 2;
			}
		}
		for (int k = 0; k < z; k += n) {
			System.out.println("kÃß°¡´ï k="+k);
			for (int m = 0; m < z; m += n) {
				System.out.println("mÃß°¡´ï m="+k);
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						for (int l = 0; l < n; l++) {
							pImg[k + i][j + m] += b[i][l] * pImgpix[l + k][j + m];
							System.out.print(" k+i="+(k+i));
							System.out.print("j+m="+(j+m));
						}
						System.out.println();
					}
				}
			}
		}
		
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < z; j++) {
				System.out.print(pImg[i][j]+" ");
			}
			System.out.println();
		}

	}
}
