package overridingpractice;

public class CarpetBombingAirstrike extends Airstrike{

	public CarpetBombingAirstrike(String name, String missionDetails) {
		super(name, missionDetails);
		
	}

	@Override
	public CarpetBombingAirstrike getAirstrikePlan() {
		System.out.println("Carpet Bombing Airstrike");
		
		return this ;
	}
	

}
