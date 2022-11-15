package io.huseyinaydin.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;

		process(someNumbers, key, wrapperLambda((i, k) -> {
			try {
				System.out.println(i / k);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : someNumbers) {
			biConsumer.accept(i, key); // bu alt metotda geri döndürülen biconsumer'in içindeki accepti çaðýrýr // alt metotu yukarýda syso þeklinde tanýmladýk
		}
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer){
		return (v,k)->{
			try {
				biConsumer.accept(v, k);
			}
			catch (ArithmeticException e) {
				// TODO: handle exception
			}
		};
	}

}
