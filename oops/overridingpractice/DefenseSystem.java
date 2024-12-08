package overridingpractice;

public class DefenseSystem {

	public static void main(String[] args) {
      Airstrike a=new Airstrike(null, null);
      PrecisionAirstrike p=new PrecisionAirstrike(null, null);
      CarpetBombingAirstrike c=new CarpetBombingAirstrike(null, null);
      Airstrike strikeplan=a.getAirstrikePlan();
      Airstrike strikeplanA=p.getAirstrikePlan();
       System.out.println("Targetting Coordinates locked.minumum colletral damage ensured");
       Airstrike strikeplanB=c.getAirstrikePlan();
       System.out.println("All cordinates in a 5km radius will be bombed for maximum impact");
       
      


	}

}
