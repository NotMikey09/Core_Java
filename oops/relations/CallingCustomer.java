package relations;

public class CallingCustomer 
{
	public static void main(String[] args)
	{
		Order o=new Order("2178","Laptop");
		Customer c=new Customer("Pratyush","Heythere@gmail.com",o);
		System.out.println(c);
	}
}
