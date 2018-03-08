
public class Person {
	private String name;
	private double salary;
	private Adress adress;

	public Person() {
		adress = new Adress();
		name = "bob";
		salary = 0;
	}

	public void moreMoney() {
		salary += 1000;
	}

}
