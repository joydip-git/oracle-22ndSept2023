import java.util.Comparator;

public class PersonComparer implements Comparator<Person> {

	private int sortChoice;

	public PersonComparer() {
	}

	public PersonComparer(int choice) {
		sortChoice = choice;
	}

	@Override
	public int compare(Person o1, Person o2) {
		if (o1 == o2)
			return 0;

		int result = 0;
		switch (sortChoice) {
		case 1:
			result = o1.getId() - o2.getId();
			break;

		case 2:
			result = o1.getName().compareTo(o2.getName());
			break;

		case 3:
			result = (int) (o1.getSalary() - o2.getSalary());
			break;

		default:
			break;
		}
		return result;
	}
}
