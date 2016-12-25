package eulerProject;

import java.math.BigInteger;

public class MyUtils {

	public static void main(String[] args) {
		
	}
	
public static boolean isPalandrome(int n){
		
		String p = Integer.toString(n);
		return isPalandrome(p);
	}
	
	public static boolean isPalandrome(String p){
		
		String q = getReverseString(p);
		if(p.equals(q)){
			
			return true;
		}else return false;
	}

	private static String getReverseString(String p) {
		String q = "";
		
		for(int i = (p.length()-1); i >= 0; i-- ){
			q = q.concat(Character.toString(p.charAt(i)));
		}
		
		return q;
	}
	
	public static BigInteger lcm(BigInteger x, BigInteger y){
		
		return	x.multiply(y).divide(x.gcd(y));
		
	}
	
	public static BigInteger computeSmallestMultiple(int i, int j){
		
		BigInteger n = BigInteger.ONE;
	
		for(int k = i; k <= j; k++ ){
			n = MyUtils.lcm(BigInteger.valueOf(k), n);
		}

	return n;
	}
	
	//This method finds the sum of squares from one to a given number n.
	
	public static BigInteger sumOfSquares(int n){
		
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 1; i <= n; i ++){
			sum = sum.add(BigInteger.valueOf(i*i));
		}
		
		return sum;
	}
	
	//This method find the square of sums of numbers from one to a given number n.
	
	public static BigInteger squareOfSums(int n){
		
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 1; i <= n; i ++){
			sum = sum.add(BigInteger.valueOf(i));
		}
		
		return (sum.multiply(sum));
	}

}
