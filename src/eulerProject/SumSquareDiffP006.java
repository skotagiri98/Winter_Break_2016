package eulerProject;

public class SumSquareDiffP006 {

	public static void main(String[] args) {
		
		System.out.println("Sum of squares from 1 to 10 = " + MyUtils.sumOfSquares(10));
		System.out.println("The square of sums from 1 to 10 = " + MyUtils.squareOfSums(10));
		new SumSquareDiffP006().sumSquareDiffrence(100);
	}
	
	public void sumSquareDiffrence(int n){
		 System.out.println(MyUtils.squareOfSums(n).subtract(MyUtils.sumOfSquares(n))); 
	}

}
