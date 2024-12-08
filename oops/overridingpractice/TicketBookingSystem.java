package overridingpractice;

public class TicketBookingSystem {

	public static void main(String[] args) {

		TrainTicket t=new TrainTicket("CityA","CityB", 50, 123);
		t.displayTicketDetails();
		System.out.println("--------------");
		BusTicket b=new BusTicket("CityX", "CityY", 30, "Xyz");
		b.displayTicketDetails();
		System.out.println("--------------");
		FlightTicket f=new FlightTicket("Hyderabad", "Banglore", 5000, 123);
		f.displayTicketDetails();
		
	
	}

}
