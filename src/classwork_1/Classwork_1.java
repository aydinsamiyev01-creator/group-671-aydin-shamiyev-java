package classwork_1;

public class Classwork_1 {
	public static void main(String[] args) {
		int number = -7;

		if (number > 0) {
			System.out.println("Число положительное");
		} else if (number < 0) {
			System.out.println("Число отрицательное");
		} else {
			System.out.println("Число равно нулю");
		}
	}
}



for (int i = 1; i <= 10; i++) {
    System.out.println(i + " -> " + (i * i));
}



for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}



for (int row = 0; row < 4; row++) {
    for (int col = 0; col < 8; col++) {
        // Проверяем сумму индексов. Если четная - символ, нечетная - пробел
        if ((row + col) % 2 == 0) {
            System.out.print("#");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
