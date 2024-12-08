package overridingpractice;

public class TrainTicket extends Ticket {
	int TrainNumber;
	public TrainTicket(String source,String destination,int price,int TrainNumber)
	{
		super(source,destination,price);
		this.TrainNumber=TrainNumber;
	}
	@Override
	public void displayTicketDetails() {
		
		super.displayTicketDetails();
		System.out.println("Train Number: "+TrainNumber);
	}
	

}
