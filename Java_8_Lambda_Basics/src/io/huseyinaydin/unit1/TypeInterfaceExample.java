package io.huseyinaydin.unit1;

public class TypeInterfaceExample {
	public static void main(String[] args) {
		StringLengthLambda stringLengthLambda = s -> s.length();
		System.out.println(stringLengthLambda.getLength("merhaba"));
		printLengthLambda(s -> s.length());
	}

	public static void printLengthLambda(StringLengthLambda stringLengthLambda) {
		System.out.println(stringLengthLambda.getLength("merhabaa"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
