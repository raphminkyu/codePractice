package codeWarsCode;


import java.util.Arrays;

//https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java


	public  class PangramChecker {
		  public boolean check(String sentence){
			  
			  sentence = sentence.toLowerCase();
			  sentence = sentence.replaceAll("[^a-z]", "");
	
			  
			  
			  String[] alphaList  = sentence.split("");
			  
			  
			  String[] unique = Arrays.stream(alphaList).distinct().toArray(String[]::new);
			  System.out.println(unique.length);
			  if(unique.length != 26 ) {
				  return false;
			  }else {
				  return true;
			  }
		
		  
			  //sentence.chars().filter(Character::isLetter).map(Character::toLowerCase).distinct().count() == 26
		  
		}
	
   
}
	
	
