package classwork_16;

public class Task2 {
	public static boolean isLuckyTicket(int number) {
		int d1 = (number / 100000 % 10);
		int d2 = (number / 10000 % 10);
		int d3 = (number / 1000 % 10);
		int d4 = (number / 100 % 10);
		int d5 = (number / 10 % 10);
		int d6 = (number % 10);
		int sum1 = (d1 + d2 + d3);
		int sum2 = (d4 + d5 + d6);
		return (sum1 == sum2);
	}

}
