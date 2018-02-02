
public class Person {
private String name;
private double salary;
private Occupation job;
private Schedule meetingSchedule;
public Person() {
	name="bob";
	salary=0;
	job = new Occupation();
	meetingSchedule=new Schedule();
}
public void moreMoney() {
salary+=1000;
}
}
