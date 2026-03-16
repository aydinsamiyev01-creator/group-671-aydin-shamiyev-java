package classwork_16;

public class Main {
	public static void main(String[] args) {
		int[] tests = {123006, 123456, 111111, 999000, 100001, 555555};
		for (int n : tests) {
			System.out.println(n + "->" + isLuckyTicket(n));
		}
	}

}
