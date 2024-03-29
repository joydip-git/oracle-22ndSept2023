import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// useSetOfNumbers();
		// useSetOfPeople();
		useTreeSetOfPeople();
	}

	private static void useTreeSetOfPeople() {
		Person sunilPerson = new Person(2, "sunil", 1000);
		Person joydipPerson = new Person(1, "joydip", 3000);
		Person anilPerson = new Person(3, "anil", 2000);
		// Person anilPerson = new Person(2, "sunil", 1000);

		// TreeSet expects that you have implemented Comparable<Person> interface in
		// Person class

		System.out.println("1. sort by id\n2. sort by name\n3. sort by salary");
		System.out.print("\nenter choice: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		// in this case the compare method from PersonComparer class will be called by
		// TreeSet to sort the elements
		// TreeSet<Person> setOfPeople = new TreeSet<>(new PersonComparer(choice));

		// in this case the compareTo method from Person class will be called by
		// TreeSet to sort the elements
		TreeSet<Person> setOfPeople = new TreeSet<>();
		setOfPeople.add(sunilPerson);
		setOfPeople.add(anilPerson);
		setOfPeople.add(joydipPerson);

		for (Person value : setOfPeople) {
			System.out.println(value);
		}
	}

	private static void useSetOfPeople() {
		Person sunilPerson = new Person(2, "sunil", 1000);
		Person joydipPerson = new Person(1, "joydip", 3000);
		// Person anilPerson = new Person(3, "anil", 2000);
		Person anilPerson = new Person(2, "sunil", 1000);

		// Integer.hashCode(sunilPerson.getId())

		Set<Person> setOfPeople = new HashSet<Person>();
		setOfPeople.add(sunilPerson);
		setOfPeople.add(anilPerson);
		setOfPeople.add(joydipPerson);

		for (Person value : setOfPeople) {
			System.out.println(value);
		}
	}

	static void useSetOfNumbers() {
		Set<Integer> setOfNumbers = new HashSet<Integer>();
		setOfNumbers.add(12);
		setOfNumbers.add(13);
		setOfNumbers.add(12);
		// setOfNumbers.addAll(new ArrayList<Integer>());

		for (Integer value : setOfNumbers) {
			System.out.println(value);
		}
		setOfNumbers.remove(12);
		System.out.println("\nafter removal\n");
		Iterator<Integer> it = setOfNumbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
