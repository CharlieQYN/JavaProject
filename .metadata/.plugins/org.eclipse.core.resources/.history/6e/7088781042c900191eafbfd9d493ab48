package basic;

import java.math.BigInteger;
import java.util.Scanner;

public class BasicKnowledge {
	public static boolean isPrime (int N) {
		if (N < 2) return false;
		for (int i = 2; i * i <= N; i++)
			if (N % i == 0) return false;
		return true;
	}
	
	/*
	public static int rank(int key, int[] a, int lo, int hi) {
		if (lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) return rank(key, a, lo, mid - 1);
		else if (key > a[mid]) return rank(key, a, mid + 1, hi);
		else return mid;
			
	}
	
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}
	*/
	
	
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi + lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) hi = mid + 1;
			else return mid;
			
		}
		
		return -1;			
	
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for(int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1).divide(BigInteger.valueOf(i)));	
		}
		
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
		in.close();
		
		
	}
	
			
	
}
