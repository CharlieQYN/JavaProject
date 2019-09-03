package digit;
import java.util.Scanner;

public class TestNumber {
	
	public static void main(String[] args) {
		/*
		int i = 5;
		Integer it = new Integer(i);
		
		int i2 = it.intValue();
		
		System.out.println(it instanceof Number);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		*/
		
		/*
		double d = 3.14159;
		Double db = new Double(d);
		
		double d2 = db.doubleValue();
		double d3 = db;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		*/
		
		//int i = 5;
		//Method 1
		//String str = String.valueOf(i);
		
		//Method 2
		//Integer it = i;
		//String str2 = it.toString();
		
		//String str = "999";
		//int i = Integer.parseInt(str);
		//System.out.println(i);
		
		/*
		double d = 3.14;
		String str = String.valueOf(d);
		System.out.println(str);
		
		String str2 = "3.14";
		double d2 = Double.parseDouble(str2);
		System.out.println(d2);
		*/
		
		/*
		String name = "Garen";
		int kill = 8;
		String title = "Chaoshen";
		
		String sentenceFormat = "%s 进行了 %d 次击杀后，获得了  %s 的称号%n";
		System.out.printf(sentenceFormat, name, kill, title);
		
		System.out.format(sentenceFormat, name, kill, title);
		*/
		
		
		
		Scanner stringInput = new Scanner(System.in);
		String str = stringInput.toString();
		char[] cs = str.toCharArray();
		
		for(int i = 0; i < cs.length; i++) {
			if(Character.isUpperCase(cs[i]) || Character.isDigit(cs[i]))
				System.out.print(cs[i]);
		}
		
		stringInput.close();
		
		
		
	}
}
