package inheritenceTu;

public class Main {

	public static void main(String[] args) {

		System.out.println("This is how a car works");
		Car car = new Car();

		car.startEngine();

		car.numberOfSeats(5);

		car.applyBrakes();

		car.stopEngine();
		

		// Vehicle class
		Vehicle vehicle = new Vehicle();

		// Truck
		Truck truck = new Truck();
		truck.startEngine();
		truck.towTrailer(true);
		truck.applyBrakes();
		truck.stopEngine();

	}

}
