//https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
import java.util.Arrays;

public class DetectPangram {
	public static class PangramChecker {
		  public boolean check(String sentence){
			  
			  char[] alphaList  = String.toCharArray();
			  Arrays.sort(alphaList);
			  
			  char[] unique = Arrays.stream(alphaList).distinct().toArray(char[]::new);
		  }
		  
		  return false;
		  
		}
	
	public static void main(String[] args) {
		check()
	}
}
