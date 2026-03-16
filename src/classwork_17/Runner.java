package classwork_17;

import java.util.Random;

public class Runner {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
		}
		
		for (int num : arr) {
			System.out.println(num + " ");
		}
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("Sum =" + sum);
		
	}
	

}
