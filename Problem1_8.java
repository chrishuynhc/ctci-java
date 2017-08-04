import java.util.*;

public class Problem1_8 {
	
	public static void main(String args[]){
		
		int[][] matrix = {{0, 2, 5, 1},
						  {1, 4, 1, 2},
						  {4, 2, 1, 1},
						  {1, 1, 1, 0}};
		
		zeroMatrix(matrix);
		System.out.println(Arrays.deepToString(matrix));
		
	}
	
	public static void zeroMatrix(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				if (matrix[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}	
		}
		
		for (int i = 0; i < row.length; i++){
			if(row[i] == true){
				nullifyRow(i, matrix);
			}
		}
		
		for (int i = 0; i < col.length; i++){
			if(col[i] == true){
				nullifyCol(i, matrix);
			}
		}	
	}
	
	//Nullify Methods
	public static void nullifyRow(int row, int[][] matrix){
		for (int i = 0; i < matrix[0].length; i++){
			matrix[row][i] = 0;
		}
	}
	
	public static void nullifyCol(int col, int[][] matrix){
		for (int i = 0; i < matrix.length; i++){
			matrix[i][col] = 0;
		}
	}
}
