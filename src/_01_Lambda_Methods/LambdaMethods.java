package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			System.out.println();
			String backwards = "";
			for (int i = s.length()-1; i>=0; i--) {
				backwards += s.charAt(i);
			}
			for (int i = 0; i < 10; i++) {
				System.out.println(backwards);
			}
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			System.out.println();
			String random = "";
			for (int i = 0; i < s.length(); i++) {
				if (Math.random()<0.5) {
					random+=s.substring(i, i+1).toLowerCase();
				}
				else {
					random+=s.substring(i, i+1).toUpperCase();
				}
			}
			
			for (int i = 0; i < 10; i++) {
				System.out.println(random);
			}
		}, "repeat");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			System.out.println();
			String newString = ""; 
			for (int i = 0; i < s.length(); i++) {
				newString+=s.charAt(i);
				newString+=".";
			}
			
			for (int i = 0; i < 10; i++) {
				System.out.println(newString);
			}
			
		}, "repeat");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			System.out.println();
			String noVowels = ""; 
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u') {
					noVowels+=s.charAt(i);
				}
			}
			for (int i = 0; i < 10; i++) {
				System.out.println(noVowels);
			}
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
