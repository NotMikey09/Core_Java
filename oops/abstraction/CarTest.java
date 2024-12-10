package abstraction;

public class CarTest extends Car{

	public CarTest(String brand, String model, int mileage, int top_speed, int yearOfManufacturing) {
		super(brand, model, mileage, top_speed, yearOfManufacturing);
		
	}

	@Override
	void display() {
		
		System.out.println("Brand name : "+brand);
		System.out.println("Car Model : "+model);
		System.out.println("Milage of car : "+mileage);
		System.out.println("Top speed : "+top_speed);
		System.out.println("Year of manufacture : "+yearOfManufacturing);
	}
	
	public static void main (String []args)
	{  
		System.out.println("-----------------------------");
		CarTest test=new CarTest("Volkswagen","Virtus GT Plus", 20, 190, 2024);
		test.display();
		System.out.println("-----------------------------");
	}

}
