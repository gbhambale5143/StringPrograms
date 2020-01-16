package com.stringDemo;

public class CountEndsWithSuffix {


	public static int endingWith(String str,String suff) {
		int count=0;
		String word[] = str.split(" ");

		for(int i = 0;i<word.length;i++) {
			if(word[i].endsWith(suff)) {
				count++;

			}
		}
		return count;

	}


	public static void main(String[] args) {

String str="Hello Melllo Bello melllo";
		String suff = "lo";
     System.out.println(endingWith(str,suff)); 
      



	}

}
