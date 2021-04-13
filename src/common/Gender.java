package common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Gender {
	FEMALE, MALE;

	// Adapted from: https://stackoverflow.com/a/1972399
	private static final List<Gender> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Gender randomGender() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
