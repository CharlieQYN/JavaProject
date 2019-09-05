package problems;

public class EvenFibonacciNumbers {
	public static void main(String[] args) {
		long sum = 2;
		long[] fibonacci = new long[3999999];
		fibonacci[0] = 1;
		fibonacci[1] = 2;
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			if (fibonacci[i] % 2 == 0) sum += fibonacci[i];
		}
		System.out.println(sum);
	}
}
