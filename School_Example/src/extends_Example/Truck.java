package extends_Example;

public class Truck extends Car{
	Truck(){
		super("SM3");
		System.out.println("Truck 생성자");
	}
	public static void main(String[] args) {
		Truck mytruck = new Truck();
	}
}