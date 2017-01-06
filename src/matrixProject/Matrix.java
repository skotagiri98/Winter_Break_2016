package matrixProject;

public class Matrix {
	
	private int n = 0;
	private int m = 0;
	private int [][] matrix = new int [n][m];
	
	public Matrix(int n, int m){
		this.n = n;
		this.m = m;
	}
	public Matrix(int [][] matrix){
		this.matrix = matrix;
	}
	public int getRows(){
		return this.n;
	}
	public int getColumns(){
		return this.m;
	}
	public void setRows(int n){
		if(matrix.length == 0 && matrix[0].length == 0)
			this.n = n;
	}
	public void setColumns(int m){
		if(matrix.length == 0 && matrix[0].length == 0)
			this.m = m;
	}
	public void setValue(int n, int m, int value){
		matrix[n][m] = value;
	}
	public int [][] getArrayOfMatrix(){
		return this.matrix;
	}
	
	public Matrix multiply(Matrix mat){
		
		int [][] matrix1 = mat.getArrayOfMatrix();
		int [][] product = new int [matrix.length][matrix1[0].length];
		
		if(matrix1.length == matrix[0].length){
			for(int i = 0; i <= matrix.length - 1; i++){
				for(int j = 0; j <= matrix1[0].length - 1; j++){
					for(int k = 0; k <= matrix[0].length - 1; k ++){
						product [i][j] += matrix[i][k] * matrix1[k][j];
					}
				}	
			}
			Matrix result = new Matrix(product);
			return result;
		}else throw new IllegalArgumentException("matricies are not of the same size");
	}
	public void print(){
		for(int i = 0; i <= matrix.length -1; i++ ){
			for(int j = 0; j <= matrix[0].length -1; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
