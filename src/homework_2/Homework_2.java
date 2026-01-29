package homework_2;

public class Homework_2 {
	public static void main(String[] args) {
		//1
		Student s1 = new Student("Aydin", 19, 4.8);
        Student s2 = new Student("Zeynab", 21, 4.3);

        s1.printInfo();
        s2.printInfo();
    }
	//2
	if (values.length == 0) {
        System.out.println("Нет чисел");
        return;
    }

    int max = values[0];
    for (int v : values) {
        if (v > max) {
            max = v;
        }
    }
    System.out.println("Максимум: " + max);
}

 System.out.println(sum(3, 5));
    System.out.println(average());
    System.out.println(average(5));
    System.out.println(average(1, 2, 3));
    System.out.println(average(1, 2, 3, 4, 5));

    printMax();
    printMax(7);
    printMax(1, 9, 3);
    printMax(5, 2, 8, 1, 4);
}
}
    //3
Printer printer = new Printer();

printer.print("Привет");
printer.print(42);
printer.print(9.8, "м/с²");
}
}
	
