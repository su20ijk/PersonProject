
public class Schedule {
	private String[] schduledMeetings;

	public Schedule() {
		schduledMeetings=new String[5];
	}
	
	public String[] getSchduledMeetings() {
		return schduledMeetings;
	}

	public void setSchduledMeetings(String[] schduledMeetings) {
		this.schduledMeetings = schduledMeetings;
	}

	public String mySchedule() {
		String schedule="";
		for(int i=0; i<5; i++) {
			if(schduledMeetings[i]!=null) {
				schedule=schedule+schduledMeetings[i]+"/n";
			}
		}
		return schedule;
	}
}
