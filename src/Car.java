
public class Car {
	String brand, model;
    int year, speed = 0;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year  = year;
    }

    public void accelerate(int kmh) {
        speed = Math.min(speed + kmh, 200);
    }

    public void brake(int kmh) {
        speed = Math.max(speed - kmh, 0);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ") → " + speed + " км/ч";
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020);
        car.accelerate(80);
        car.accelerate(90);  
        System.out.println(car); 
    }
}


