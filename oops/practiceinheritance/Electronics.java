package practiceinheritance;

public class Electronics extends Product
{
	private String brand;
	public Electronics(String name, double price,String brand) 
	{
		super(name, price);
		this.brand=brand;
	}
	void displayInfo()
	{
		super.displayInfo();
		System.out.println("Brand name : "+brand);
	}
	
}
