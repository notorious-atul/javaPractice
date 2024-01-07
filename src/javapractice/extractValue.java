package javapractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractValue {

	public static void main(String[] args) {
		
		String phoneex = "my phone number is 91-8755232223232009";
		
		String regex = "\\b\\d{2}[-.]\\d{16}";
		
		Pattern pattern = Pattern.compile(regex);

        // Create a matcher with the input sentence
        Matcher matcher = pattern.matcher(phoneex);

        // Find and print all phone numbers in the sentence
        while (matcher.find()) {
            String phoneNumber = matcher.group();
            System.out.println("Phone Number: " + phoneNumber);
        }
    } }
