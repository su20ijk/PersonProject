
public class Occupation {
	
		private String companyName;
		private String jobTitle;
	
		public Occupation() {
			companyName = "Target";
			jobTitle = "Floor Manager";
		}
		
		public String nameTag() {
			return companyName + "\n" +  jobTitle;
		}
}
