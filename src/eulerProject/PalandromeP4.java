package eulerProject;

public class PalandromeP4 {

	public static void main(String[] args) {

		
		//System.out.println(MyUtils.isPalandrome("arora"));
		//System.out.println(MyUtils.isPalandrome(101));
		//System.out.println(new PalandromeP4().toString());
		System.out.println("Max Palandrome = " + findLargestPalandrome());
	}
	
	public static int findLargestPalandrome(){
		
		int p = 0;
		
		for(int i = 999; i >= 100; i--){
			for(int j = 999; j >= 100; j--){
				int x = i*j;
				if(MyUtils.isPalandrome(x) && (x) > p){
					p = x;
					//System.out.println(p);
				}
			}
		}
		return p;
	}

}
