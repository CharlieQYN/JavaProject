package j2se;

import java.util.Arrays;
import java.util.Date;

import javax.xml.crypto.Data;

public class Test {
	public static void main(String[] args) {
		int[] smallPrimes = {2, 3, 5, 7, 11, 13};
		int[] luckyNumbers = smallPrimes;
		System.out.println(luckyNumbers[5]);
		
		int[] copyLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
		System.out.println(Arrays.toString(smallPrimes));
		
		
		
	}
	
	
	
}	
