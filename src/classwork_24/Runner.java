package classwork_24;

public class Runner {
	public static void main(String[] args) {
		//1
		Dog myDog = new Dog("Шарик", "Корги", 3);
		myDog.bark();
		myDog.introduce();
		//2
		Rectangle rect = new Rectangle(5.0, 10.0);
	    System.out.println("Площадь: " + rect.area());         
	    System.out.println("Периметр: " + rect.perimeter());   
	    System.out.println("Это квадрат? " + rect.isSquare()); 
	    System.out.println("---");
	    Rectangle square = new Rectangle(7.5, 7.5);
        System.out.println("Это квадрат? " + square.isSquare());
		
	}

}
