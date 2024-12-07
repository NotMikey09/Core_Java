package relations;

public class CallingPerson 
{
	public static void main(String args[])
	{
		Address a=new Address("Ameerpeth ","Hyderabad");
		Person p=new Person(a,"Pratyush");
		p.display();
	}
}
