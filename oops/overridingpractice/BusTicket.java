package overridingpractice;

public class BusTicket extends Ticket{
	String BusComName;
	public BusTicket(String source, String destination, int price,String BusComName) {
		super(source, destination, price);
		this.BusComName=BusComName;
	}
	@Override
	public void displayTicketDetails() {
	
		super.displayTicketDetails();
		System.out.println("Bus Company Name: "+BusComName);
	}


	

}
