package j2se;
import java.util.Scanner;

import javax.management.NotificationEmitter;

public class HelloWorld {
	
	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("第一个整数：" + a);
		int b = s.nextInt();
		System.out.println("第二个整数：" + b);
		System.out.println("两个数的和是：" + (a + b));
		*/
		
		/*
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		System.out.println(j);
		*/
		
		/*
		Scanner bodyInfo = new Scanner(System.in);
		System.out.println("请输入身高（m）：");
		double height = bodyInfo.nextDouble();
		System.out.println("请输入体重（kg）：");
		int weight = bodyInfo.nextInt();
		
		double BMI = weight / (height * height);
		System.out.println("当前的BMI是：" + BMI);
		if(BMI >= 35)
			System.out.println("重度肥胖");
		else if (BMI >= 30)
			System.out.println("中度肥胖");
		else if(BMI >= 27)
			System.out.println("轻度肥胖");
		else if(BMI >= 24)
			System.out.println("体重过重");
		else if(BMI >= 18.5)
			System.out.println("正常范围");
		else 
			System.out.println("体重过轻");
		*/
		
		
		/*
		int i = 1;
		boolean b = !(i++ == 3) ^ (i++ == 2) && (i++ == 3);
		System.out.println(b);
		System.out.println(i);
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println("读取的整数是：" + i);
		String rn = s.nextLine();
		String a = s.nextLine();
		System.out.println("读取的字符串是：" + rn);
		System.out.println("读取的字符串是：" + a);
		*/
		
		/*
		Scanner yearInput = new Scanner(System.in);
		int year = yearInput.nextInt();
		if((year % 4 == 0)&&(year % 100 != 0)||(year % 400 == 0))
			System.out.println(year + "是闰年");
		else 
			System.out.println(year + "不是闰年");
		yearInput.close();
		*/
		
		/*
		Scanner numberInput = new Scanner(System.in);
		int number = numberInput.nextInt();
		int factorial = 1;
		while (number >= 1) {
			factorial *= number;
			number -= 1;
			
		}
		System.out.println("阶乘是" + factorial);
		numberInput.close();
		*/
		
		/*
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		/*
		int[] a = new int[5];
		a[0] = (int) (Math.random() * 100);
		a[1] = (int) (Math.random() * 100);
		a[2] = (int) (Math.random() * 100);
		a[3] = (int) (Math.random() * 100);
		a[4] = (int) (Math.random() * 100);
		 
		System.out.println("数组中的各个随机数是:");
		for (int i = 0; i < a.length; i++)
		    System.out.println(a[i]);
		 
		System.out.println("本练习的目的是，找出最小的一个值: ");
		int minimum = 0;
		for (int j = 0; j < a.length; j ++) {
			if(j == 0)
				minimum = a[j];	
			if(minimum > a[j])
				minimum = a[j];		
		}
		
		System.out.println("a数组的最小值是：" + minimum);
		*/
		
		/*
		int[] a = new int[5];
		a[0] = (int) (Math.random() * 100);
		a[1] = (int) (Math.random() * 100);
		a[2] = (int) (Math.random() * 100);
		a[3] = (int) (Math.random() * 100);
		a[4] = (int) (Math.random() * 100);
		 
		System.out.println("数组中的各个随机数是:");
		for (int i = 0; i < a.length; i++)
		    System.out.println(a[i]);
		
		int temp = 0;
		for(int i = 0; i < a.length / 2; i++) {
			temp = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = temp;
		}
		System.out.println("数组中的各个随机数是:");
		for (int i = 0; i < a.length; i++)
		    System.out.println(a[i]);
		*/
		
		int []a = new int[] {24, 49, 23, 28, 26, 67, 89};
		int []b = new int[] {65, 70, 86, 77, 43, 10};
		System.out.println("数组a的内容是：");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("数组b的内容是：");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println("数组c的内容是:");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		
	}
	
}
