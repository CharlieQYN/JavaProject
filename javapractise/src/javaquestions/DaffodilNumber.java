package javaquestions;

public class DaffodilNumber {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int hundredDigit = i / 100;
			int tendigit = (i % 100) / 10;
			int digit = i % 10;
			
			int sum = (int)(Math.pow(hundredDigit, 3) + Math.pow(tendigit, 3) + Math.pow(digit, 3));
			
			if(sum == i) System.out.println(i);
		}
	}
}
