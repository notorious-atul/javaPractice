package javapractice;

public class splitString {

	public static void main(String[] args) {
		
		String splitString = "aaabbbccc";
		int noOfParts = 3;
		
		int stringSplit = splitString.length()/(noOfParts);
		
		for (int i=0;i<noOfParts;i++) {
			
			int startIndex = i * stringSplit;
			int endIndex = (i+1) * stringSplit;
			
			String finalSplit = splitString.substring(startIndex, endIndex);
			
			System.out.println("Part" + " "+ (i+1) + " "+ "=" + " "+ finalSplit);
					
			
		}
		
	}

}
