package car_Truck;

public class Car {
	String color;
	Car(String color) {
		this.color = color;
		System.out.println("카 생성자");
	}
	void print_car() {
		System.out.println(color);
	}
}
