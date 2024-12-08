package overridingpractice;

public class Airstrike {
	String name;
	String missionDetails;
	public Airstrike(String name,String missionDetails)
	{
		this.name=name;
		this.missionDetails=missionDetails;
	}
	public Airstrike getAirstrikePlan()
	{
		System.out.println("Generating a generic airstrike Plan...");
		return this;	
	}

}

