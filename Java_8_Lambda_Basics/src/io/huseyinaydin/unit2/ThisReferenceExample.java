package io.huseyinaydin.unit2;

public class ThisReferenceExample {
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, i -> System.out.println("value = " + i));
		thisReferenceExample.execute();
	}
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i ->{
			System.out.println("value = " + i);
			System.out.println(this);
		});
	}
}
