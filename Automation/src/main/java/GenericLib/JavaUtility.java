package GenericLib;

import java.util.Random;

public class JavaUtility {
	 private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	    public String randomSTring() {
	        int length = 10; // Length of the random string
	        StringBuilder stringBuilder = new StringBuilder();

	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(CHARACTERS.length());
	            char randomChar = CHARACTERS.charAt(randomIndex);
	            stringBuilder.append(randomChar);
	        }

	        String randomString = stringBuilder.toString();
	        System.out.println("Random String: " + randomString);
			return randomString;
	    }
}
