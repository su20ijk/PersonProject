
public class Person {
private String name;
private double salary;
private Schedule meetingSchedule;
public Person() {
	name="bob";
	salary=0;
	meetingSchedule=new Schedule();
}
public void moreMoney() {
	salary+=1000;
}
}
