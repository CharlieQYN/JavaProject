package j2se;
import java.util.Scanner;

import javax.management.NotificationEmitter;

public class HelloWorld {
	
	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("��һ��������" + a);
		int b = s.nextInt();
		System.out.println("�ڶ���������" + b);
		System.out.println("�������ĺ��ǣ�" + (a + b));
		*/
		
		/*
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		System.out.println(j);
		*/
		
		/*
		Scanner bodyInfo = new Scanner(System.in);
		System.out.println("��������ߣ�m����");
		double height = bodyInfo.nextDouble();
		System.out.println("���������أ�kg����");
		int weight = bodyInfo.nextInt();
		
		double BMI = weight / (height * height);
		System.out.println("��ǰ��BMI�ǣ�" + BMI);
		if(BMI >= 35)
			System.out.println("�ضȷ���");
		else if (BMI >= 30)
			System.out.println("�жȷ���");
		else if(BMI >= 27)
			System.out.println("��ȷ���");
		else if(BMI >= 24)
			System.out.println("���ع���");
		else if(BMI >= 18.5)
			System.out.println("������Χ");
		else 
			System.out.println("���ع���");
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
		System.out.println("��ȡ�������ǣ�" + i);
		String rn = s.nextLine();
		String a = s.nextLine();
		System.out.println("��ȡ���ַ����ǣ�" + rn);
		System.out.println("��ȡ���ַ����ǣ�" + a);
		*/
		
		/*
		Scanner yearInput = new Scanner(System.in);
		int year = yearInput.nextInt();
		if((year % 4 == 0)&&(year % 100 != 0)||(year % 400 == 0))
			System.out.println(year + "������");
		else 
			System.out.println(year + "��������");
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
		System.out.println("�׳���" + factorial);
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
		 
		System.out.println("�����еĸ����������:");
		for (int i = 0; i < a.length; i++)
		    System.out.println(a[i]);
		 
		System.out.println("����ϰ��Ŀ���ǣ��ҳ���С��һ��ֵ: ");
		int minimum = 0;
		for (int j = 0; j < a.length; j ++) {
			if(j == 0)
				minimum = a[j];	
			if(minimum > a[j])
				minimum = a[j];		
		}
		
		System.out.println("a�������Сֵ�ǣ�" + minimum);
		*/
		
		/*
		int[] a = new int[5];
		a[0] = (int) (Math.random() * 100);
		a[1] = (int) (Math.random() * 100);
		a[2] = (int) (Math.random() * 100);
		a[3] = (int) (Math.random() * 100);
		a[4] = (int) (Math.random() * 100);
		 
		System.out.println("�����еĸ����������:");
		for (int i = 0; i < a.length; i++)
		    System.out.println(a[i]);
		
		int temp = 0;
		for(int i = 0; i < a.length / 2; i++) {
			temp = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = temp;
		}
		System.out.println("�����еĸ����������:");
		for (int i = 0; i < a.length; i++)
		    System.out.println(a[i]);
		*/
		
		int []a = new int[] {24, 49, 23, 28, 26, 67, 89};
		int []b = new int[] {65, 70, 86, 77, 43, 10};
		System.out.println("����a�������ǣ�");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("����b�������ǣ�");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println("����c��������:");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		
	}
	
}
