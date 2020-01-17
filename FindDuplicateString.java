package com.stringDemo;

public class FindDuplicateString {

	
	
	
	public static void main(String[] args) {
       
		String str= "hello hello hi Hi hello";
		
		int count ;
		str = str.toLowerCase();
		String words[]=str.split(" ");
		System.out.println("Duplicate word in string");
		for(int i=0;i<words.length;i++) {
			
			count=1;
			for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    words[j] = "0";    
                }    
            } 
			
			
			 if(count > 1 && words[i] != "0")    
	                System.out.println(words[i]);    
	        }    
	    }    
	}    
		
			
		
		
		
		
		


