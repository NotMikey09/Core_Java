package overridingpractice;

public class Ticket {
String source;
String destination;
int price;
public Ticket(String source,String destination,int price)
{
	this.source=source;
	this.destination=destination;
	this.price=price;
	}
public void displayTicketDetails()
{
  System.out.println("Source: "+source);
  System.out.println("Destintion: "+destination);
  System.out.println("price :"+price);
}

}
