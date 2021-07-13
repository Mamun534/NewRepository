package HashMapCollision;

public class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int hashCode() {
		System.out.println("Called hashcode for:" + id + " - " + name);
		return id;
	}

	public boolean equals(Object obj) {
		
		System.out.println("Called equals on =" + id + " - " + name + " to compare with " + ((Person) obj));
		boolean result = false;
		if (obj instanceof Person) {
			if (((Person) obj).getId() == id && ((Person) obj).getName().equals(name)) {
				result = true;
				System.out.println("Result is true");
			}
		}
		return result;
	}

	public String toString() {
		return id + " . " + name;
	}
}
