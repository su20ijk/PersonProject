import java.util.ArrayList;

public class Projects {
	private ArrayList<String> completedProjects;
	private String temp;

	public Projects() {
		completedProjects = new ArrayList<String>();
		temp = null;
	}

	public String projectSummary() {
		for (int i = 0; i < completedProjects.size(); i++) {
			temp = temp + completedProjects.get(i) + "\n";
		}
		return temp;
	}

	public void addProject(String x) {
		completedProjects.add(x);
	}

}
