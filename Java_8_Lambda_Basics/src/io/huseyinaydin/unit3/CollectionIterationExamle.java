package io.huseyinaydin.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import io.huseyinaydin.unit1.Person;

public class CollectionIterationExamle {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("H�seyin", "Ayd�n", 25),
				new Person("Yasin", "Ayd�n", 20),
				new Person("Abcd", "Cabc", 32));
		/*persons.forEach((p)->System.out.println(p));
		persons.forEach(System.out::println);*/
		persons.stream().filter((p) -> p.getLastName().startsWith("C")).forEach(System.out::println);
		Stream<Person> stream = persons.parallelStream();
		long count = stream.filter((p) -> p.getLastName().startsWith("C")).count();
		System.out.println(count);
	}

}
