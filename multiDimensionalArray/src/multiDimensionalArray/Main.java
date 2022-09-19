package multiDimensionalArray;

public class Main {
	public static void main(String[] args) {
		String[][] alphabet = new String[3][3];
		alphabet[0][0] = "a";
		alphabet[0][1] = "a";
		alphabet[0][2] = "a";
		alphabet[1][0] = "a";
		alphabet[1][1] = "a";
		alphabet[1][2] = "a";
		alphabet[2][0] = "a";
		alphabet[2][1] = "a";
		alphabet[2][2] = "a";
		
		for(int i = 0; i <=2;i++) {
			for(int j = 0; j <=2; j++) {
				System.out.println(alphabet[i][j]);
			}
		}
	}

}
