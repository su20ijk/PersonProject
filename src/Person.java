
public class Person {
private String name;
private double salary;
private Occupation job;
public Person() {
	name="bob";
	salary=0;
	job = new Occupation();
}
public void moreMoney() {
salary+=1000;
}
}
