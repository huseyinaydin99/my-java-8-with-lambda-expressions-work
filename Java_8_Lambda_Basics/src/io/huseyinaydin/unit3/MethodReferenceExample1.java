package io.huseyinaydin.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		//Thread thread = new Thread(()->printMessage());
		Thread thread = new Thread(MethodReferenceExample1::printMessage);
		thread.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
