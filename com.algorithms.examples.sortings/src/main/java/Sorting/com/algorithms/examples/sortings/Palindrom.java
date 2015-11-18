package Sorting.com.algorithms.examples.sortings;

public class Palindrom {
	
	public static void main(String args[]){
		
		String[] input  = {"abccba1", "a" , "abc" , "aaa" , "abcdeffedcba", "aaaaaaaaaaabbaaaaaaaaaaa", null, ""};
		
		for(String str: input){
			System.out.println(str + " is palindrom :" + isPalindrom(str));
		}
	}
	
	public static boolean isPalindrom(String in){

		if(in==null || in.length()==0 || in.length()==1)
			return true;
		
		int beginPtr =0, endPtr = in.length()-1;
		
		while(beginPtr!=endPtr && (in.charAt(beginPtr++) == in.charAt(endPtr--) && beginPtr<(in.length())/2)) ;
		
		if(in.charAt(beginPtr) == in.charAt(endPtr))
			return true;
		
		return false;

	}

}
