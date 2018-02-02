
public class Person {
	private String name;
	private double salary;
	private Projects completed;
	
	public Person() {
		name = "bob";
		salary = 0;
		completed = new Projects();
	}

	public void moreMoney() {
		salary += 1000;
	}
	
	public void addProject(String x) {
		completed.addProject(x);
	}
	
	public String completedProjects() {
		return completed.projectSummary();
	}
}
