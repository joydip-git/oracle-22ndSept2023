
public class Person {

	private String name;
	private int id;
	private double salary;

	public Person() {

	}

	public Person(String name, int id, double salary) {
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
		return "Name: " + name + ", Id: " + id + ", salary: " + salary;
	}

	// if you don't have any resource to release do not override the method
	// unnecessarily
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalizing....");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		Person other = (Person) obj;
		if (this.id != other.id)
			return false;

		if (!this.name.equals(other.name))
			return false;

		if (this.salary != other.salary)
			return false;

		return true;
	}

}
