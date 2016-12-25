package eulerProject;

public class PalandromeP4 {

	public static void main(String[] args) {

		
		System.out.println(isPalandrome("arora"));
		System.out.println(isPalandrome(101));
	}
	
	public static boolean isPalandrome(int n){
		
		String p = Integer.toString(n);
		return isPalandrome(p);
	}
	
	public static boolean isPalandrome(String p){
		
		String q = "";
		
		for(int i = (p.length()-1); i >= 0; i-- ){
			q = q.concat(Character.toString(p.charAt(i)));
		}
		System.out.println(q);
		if(p.equals(q)){
			return true;
		}else return false;
	}

}
