package com.stringDemo;

public class PalindromDemo {

	static public boolean isPalindrom(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j))
				return false;

			i++;
			j--;

		}
		return true;


	}




	public static void main(String[] args) {

		String str="gggooogg";
		if(isPalindrom(str))
			System.out.println("yes");
		else System.out.println("no");
	}

}
