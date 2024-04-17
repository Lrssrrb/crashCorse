package q8;

public class Main {
	public static void main(String[] args) {
		
	ElectricCar eCar = new ElectricCar();
	System.out.println(eCar.drive());
	System.out.println(eCar.fuelType());

	GasCar gCar = new GasCar();
	System.out.println(gCar.drive());
	System.out.println(gCar.fuelType());
	
	}
}
