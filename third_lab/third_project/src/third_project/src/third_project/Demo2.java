package third_project;
class Vehicle{
	String make;
	String model;
	int year;
	String fueltype;
	
	public Vehicle(String make, String model, int year, String fueltype) {
		this.make = make;
		this.model = model;
		this.year= year;
		this.fueltype = fueltype;
	}
void displayYear() {
	System.out.println(this.year);
}
class Truck extends Vehicle{
	public Truck(String make, String model, int year, String fueltype){
		super(make, model, year, fueltype);
	}
}
class Car extends Vehicle{
	public Car(String make, String model, int year, String fueltype){
		super(make, model, year, fueltype);
	}
}
class Motorcycle extends Vehicle{
	public Motorcycle(String make, String model, int year, String fueltype){
		super(make, model, year, fueltype);
	}
}
public class Demo2 {
	public static void main(String[] args) {
	}
}
}
