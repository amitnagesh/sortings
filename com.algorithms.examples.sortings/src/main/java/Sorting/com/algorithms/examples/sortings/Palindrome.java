package Sorting.com.algorithms.examples.sortings;

public class Palindrome {
	
	public static void main(String args[]){
		
		String input[]  = {"abccba1", "a" , "abc" , "aabcc", "aaa" , "abcdeffedcba", "aaaaaaaaaaabbaaaaaaaaaaa", null, "", "baabaa", "baabaab" };
		
		for(String str: input){
			System.out.println( str + " is palindrome :" + isPalindrome(str));
		}
	}

	/**
	 * Verify isPalindrome or not
	 * @param in
	 * @return boolean
	 */
	public static boolean isPalindrome(String in) {

		if(in==null || in.length()==0 || in.length()==1)
			return true;
		
		int beginPtr =0, endPtr = in.length()-1;
		
		while(beginPtr<=endPtr && (in.charAt(beginPtr++) == in.charAt(endPtr--))) ;
		
		if(in.charAt(beginPtr) == in.charAt(endPtr) && beginPtr>endPtr)
			return true;
		
		return false;

	}

}
