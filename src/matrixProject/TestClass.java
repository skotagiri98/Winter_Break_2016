package matrixProject;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] b = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		int [][] c = new int [][]{{0,0,1},{0,1,0},{1,0,0}};
		
		Matrix a = new Matrix(b);
		a.print();
		System.out.println("");
		Matrix d = new Matrix(c);
		Matrix e = a.multiply(d);
		e.print();
	}

}
