import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// useList();
		useListOfPerson();
	}

	static void useListOfPerson() {
		List<Person> people = new ArrayList<>();
		people.add(new Person(2, "sunil", 1000));
		people.add(new Person(1, "joydip", 3000));
		people.add(new Person(3, "anil", 2000));

		//Collections.sort(people);

		for (Person person : people) {
			System.out.println(person);
		}
	}

	static void useList() {
		// ArrayList<Integer> list = new ArrayList<Integer>();
//		boolean status = list.add(12);
//		System.out.println(status ? "added" : "not added");
//		list.ensureCapacity(4);

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(1);
		list.add(11);
		list.add(4);

		// 1. using for loop
		System.out.println("\nprinting after adding first values using for\n");
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}

		// index position <= the size of the list
		// i.e. if currently 5 elements are present in the list (size = 5), then the
		// index of the
		// last element is 4. hence the new element can be placed at an index position
		// <=5
		list.add(5, 1200);

		// 2. using for-each loop
		// behind the scene uses iterator
		// during iteration using for-each loop,
		// the collection should NOT BE MODIFIED
		System.out.println("\nprinting after adding new value using foreach\n");
		for (Integer value : list) {
			System.out.println(value);
		}

		// removing by index number (directly pass Integer type value)
		list.remove(0);

		// removing by element (you need to pass value as Object data type)
		Object element = 11;
		list.remove(element);

		// sorting list using sort() method of Collections class
		Collections.sort(list);

		// 3. using iterator
		// during iteration the collection should NOT BE MODIFIED
		// i.e. you should not add new item or remove any existing item

		System.out.println("\nprinting after removes values using iterator\n");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			// gives you the current value
			System.out.println(it.next());
		}

		if (list.contains(13))
			System.out.println("exists");

	}
}
