package overridingpractice;

public class PrecisionAirstrike extends Airstrike {

	public PrecisionAirstrike(String name, String missionDetails) {
		super(name, missionDetails);
		
	}

	@Override
	public PrecisionAirstrike  getAirstrikePlan() {
		System.out.println("Precision AirStrike");
		return this;
	}
	

}
