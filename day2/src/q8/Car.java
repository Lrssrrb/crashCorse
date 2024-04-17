package q8;

public abstract class Car implements Vehicle{

	@Override
	public String drive() {
		return "Car driving";
	}
	
	public abstract String fuelType();
	
}
