package io.huseyinaydin.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Hüseyin", "Aydýn", 25),
				new Person("Yasin", "Aydýn", 20),
				new Person("Abcd", "Cabc", 32));
		Collections.sort(persons,(arg0, arg1)->arg0.getLastName().compareTo(arg1.getLastName()));
		printAll(persons);
		space();
		printLastNameBeginnigWithC(persons);
		space();
		printConditionally(persons,person->person.getLastName().startsWith("C"));
	}

	private static void printLastNameBeginnigWithC(List<Person> persons) {
		for (Person person : persons) {
			if (person.getLastName().startsWith("C"))
				System.out.println(person.toString());
		}
	}
	
	private static void printConditionally(List<Person> persons, Predicate<Person> predicate) {
		for (Person person : persons) {
			if (predicate.test(person))
				System.out.println(person.toString());
		}
	}

	public static void printAll(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}
	
	public static void space() {
		System.out.println("---------");
		System.out.println(" ");
	}

}