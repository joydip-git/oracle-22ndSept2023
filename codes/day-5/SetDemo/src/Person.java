import java.security.InvalidParameterException;

//class Person extends Object
public class Person implements Comparable<Person> {
	private String name;
	private Integer id;
	private Double salary;

	public Person() {
	}

	public Person(int id, String name, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + ", " + id + ", " + salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			throw new NullPointerException("null reference has been passed");

		if (this == obj)
			return true;

		if (obj instanceof Person) {
			Person other = (Person) obj;

			if (!this.id.equals(other.id))
				return false;

			if (!this.name.equals(other.name))
				return false;

			if (!this.salary.equals(other.salary))
				return false;

			return true;

		} else
			throw new InvalidParameterException("parameter is not of type Person");
	}

	@Override
	public int hashCode() {
		// return Integer.hashCode(this.id);
		final int prime = 31237;
//		int hash = this.id.hashCode() * prime;
//		hash = this.name.hashCode() * hash;
//		hash = this.salary.hashCode() * hash;
		int hash = this.id.hashCode() * prime;
		return hash;
	}

	@Override
	public int compareTo(Person arg0) {
		if (this == arg0)
			return 0;
		
		return this.name.compareTo(arg0.name);
	}
}
