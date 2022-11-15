package io.huseyinaydin.unit1;

public class Greeter {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		MyLambda myLambda = () -> System.out.println("selam1");
		myLambda.foo();

		MyAdd myAdd = (int s1, int s2) -> s1 + s2;
		myAdd.add(10, 11);

		Greeting greeting = () -> System.out.println("merhaba dünya");
		
		
		Greeting greeting2 = new Greeting() {
			@Override
			public void perform() {
				System.out.println("merhaba dünya");
			}
		};
		greeting.perform();
		greeting2.perform();
		Greeter greeter2 = new Greeter();
		greeter2.greet(()->System.out.println("merhaba"));
	}
}

interface MyLambda {
	void foo();
}

interface MyAdd {
	int add(int s1, int s2);
}
