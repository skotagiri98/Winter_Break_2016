package eulerProject;

public class LargestPrimeNumberP3 {

	public static void main(String[] args) {
		
		try {
			System.out.println("The largest prime of 600851475143 is " + new LargestPrimeNumberP3().largestPrime(600851475143L));
			System.out.println("The largest prime of 15 is " + new LargestPrimeNumberP3().largestPrime(15));
			System.out.println("The largest prime of 19 is " + new LargestPrimeNumberP3().largestPrime(19));
			System.out.println("The largest prime of 0 is " + new LargestPrimeNumberP3().largestPrime(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public long largestPrime(long n) throws Exception{
		while(true){
			long small = smallestFactor(n);
			
			if(small < n){
				n /= small;
			}else return n;
			
		}
	}
	
	public long smallestFactor(long n) throws Exception {
		// if n is <= 1 throw exception
		if (n <= 1)
			throw new Exception("Can not find factors, number is less than 1");
		
		/* check only until sqrt(n) because it encompasses
		the first half of factors which contains the min val.*/
		long end = (long) Math.sqrt(n);
				
		for(int i = 2; i <= end; i++ ){
			if(n % i == 0){
				return i;
			}
		}
		return n;
		
	}

}
