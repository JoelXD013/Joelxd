
public class Arrays2d {
	
	public static void main(String[] args) {
		int[][] matrix1 = new int[100][100];
		
		//fills matrix without loops
		matrix1[0][0] = 1;
		matrix1[0][1] = 2;
		matrix1[0][2] = 3;
		matrix1[1][0] = 4;
		matrix1[1][1] = 5;
		matrix1[1][2] = 6;
		matrix1[2][0] = 7;
		matrix1[2][1] = 8;
		matrix1[2][2] = 9;
		
		// 0,0  0,1  0,2
		System.out.print(matrix1[0][0] + " ");
		System.out.print(matrix1[0][1] + " ");
		System.out.print(matrix1[0][2]); 
		System.out.println();
		
		// 1,0  1,1  1,2
		System.out.print(matrix1[1][0] + " ");
		System.out.print(matrix1[1][1] + " ");
		System.out.print(matrix1[1][2]); 
		System.out.println();
		
		// 2,0  2,1  2,2
		System.out.print(matrix1[2][0] + " ");
		System.out.print(matrix1[2][1] + " ");
		System.out.print(matrix1[2][2]); // 2,0  2,1  2,2
		System.out.println();
		System.out.println();
		
		//fills matrix with loop
		int count = 1;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				matrix1[i][j] = count;
				count = count + 1;
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
