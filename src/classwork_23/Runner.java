package classwork_23;

public class Runner {
	public static void main(String[] args) {
		// 1
		for (int i = 1; i <= 25; i += 2) {
			System.out.print(i + " ");

			// 2
			int number = 54821;
			int count = 0;
			while (number > 0) {
				number /= 10;
				count++;
			}
			System.out.println("Количество цифр: " + count);

			// 3
			int sum = 0;
			for (int i = 1; i <= 50; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
			System.out.println("Сумма = " + sum);
			
			//4 
			int result = 1;
			for (int i = 1; i <= 8; i++) {
			    result *= 2;
			}
			System.out.println("2^8 = " + result);
			
			//5
			int[] nums = {4, 8, 15, 2, 99, 17};
			int max = nums[0];
			for (int i = 1; i < nums.length; i++) {
			    if (nums[i] > max) {
			        max = nums[i];
			    }
			}
			System.out.println("Максимальное число: " + max);
			
			//6
			int n = 5831;
			int digitSum = 0;
			while (n > 0) {
			    digitSum += n % 10;
			    n /= 10;
			}
			System.out.println("Сумма цифр: " + digitSum);
			
			//7
			for (int i = 1; i <= 30; i++) {
			    if (i % 15 == 0) System.out.println("FizzBuzz");
			    else if (i % 3 == 0) System.out.println("Fizz");
			    else if (i % 5 == 0) System.out.println("Buzz");
			    else System.out.println(i);
			}
			
			//8
			for (int i = 1; i <= 10; i++) {
			    System.out.println(i + " -> " + (i * i));
			}
			//9
			for (int i = 1; i <= 5; i++) {
			    for (int j = 1; j <= i; j++) {
			        System.out.print(j);
			    }
			    System.out.println();
			}
			//10
			hfor (int row = 0; row < 4; row++) {
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

			
		}

	}

}
