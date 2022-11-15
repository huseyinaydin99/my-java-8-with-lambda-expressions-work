package io.huseyinaydin.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.huseyinaydin.unit1.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Hüseyin", "Aydýn", 25),
				new Person("Yasin", "Aydýn", 20),
				new Person("Abcd", "Cabc", 32));
		Collections.sort(persons,(arg0, arg1)->arg0.getLastName().compareTo(arg1.getLastName()));
		
		performConditionally(persons,person->person.getLastName().startsWith("C"), System.out::println);// (p) -> println(p)
	}
	
	private static void performConditionally(List<Person> persons, Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person person : persons) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}
}