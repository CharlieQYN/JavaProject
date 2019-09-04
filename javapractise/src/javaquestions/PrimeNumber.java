package javaquestions;

public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i <= 200; i++) {
			int n = (int)Math.sqrt(i);
			boolean isPrime = true;
			for (int j = 2; j<= n; j++)
				if (i % j == 0) isPrime = false;
			if (isPrime) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
