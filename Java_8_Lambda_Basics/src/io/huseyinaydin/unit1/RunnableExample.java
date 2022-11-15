package io.huseyinaydin.unit1;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("merhaba thread �al��t�");	
			}
		});
		thread.run();
		Thread thread2 = new Thread(() -> System.out.println("merhaba thread2 �al��t�"));
		thread2.run();
	}

}
