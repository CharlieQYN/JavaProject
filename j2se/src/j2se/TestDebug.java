package j2se;

public class TestDebug {
	public static void main(String[] args) {
		
		int moneyEachDay = 0;
		int day = 10;
		int sum = 0;
		for (int i = 1; i <= day; i++) {
			if (moneyEachDay == 0) {
				moneyEachDay = 1;
			}
			else {
				moneyEachDay *= 2;
			}
			sum += moneyEachDay;
			
			System.out.println(i + " ��֮�� ��������е�Ǯ�����ǣ� " + sum);
		}
	}
}
