package overridingpractice;

public class FlightTicket extends Ticket{
int FLightno;
	public FlightTicket(String source, String destination, int price,int FLightno) {
		super(source, destination, price);
		this.FLightno=FLightno;
	}
	@Override
	public void displayTicketDetails() {
		
		super.displayTicketDetails();
		System.out.println("Flight Number: "+FLightno);
	}
	

}
