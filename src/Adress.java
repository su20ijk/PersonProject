
public class Adress {
	
	private String streetAdress;
	private String city;
	private String state;
	private int zip;
	
	public Adress()
	{
		streetAdress = "999 Defult Street";
		city = "Defult City";
		state = "Defult State";
		zip = 99999;
	}
	
	public String mailingLable()
	{
		return (streetAdress + "\n" + city + ", " + state + ", " + zip);
	}
	
	
}
