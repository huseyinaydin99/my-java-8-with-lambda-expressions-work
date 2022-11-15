package io.huseyinaydin.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Hüseyin", "Aydýn", 25),
				new Person("Yasin", "Aydýn", 20),
				new Person("Abcd", "Cabc", 32));
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
		});
		printAll(persons);
		space();
		printLastNameBeginnigWithC(persons);
		space();
		printConditionally(persons, new Condition() {
			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("C");
			}
		});
	}

	private static void printLastNameBeginnigWithC(List<Person> persons) {
		for (Person person : persons) {
			if (person.getLastName().startsWith("C"))
				System.out.println(person.toString());
		}
	}
	
	private static void printConditionally(List<Person> persons, Condition condition) {
		for (Person person : persons) {
			if (condition.test(person))
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
