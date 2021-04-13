package common;

import java.util.Random;

public class Utils {

	private static Random random = new Random();

	// Method adapted from:
	// https://www.baeldung.com/java-random-string#plainjava-bounded
	public static String generateRandomString(int targetStringLength) {

		String generatedString;

		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'

		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		generatedString = buffer.toString();

		return generatedString;
	}

	// generate number between low and high (including both)
	public static int generateRandomNumber(int low, int high) {
		high++;
		return random.nextInt(high - low) + low;
	}

}
