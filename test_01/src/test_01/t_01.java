package test_01;

import java.util.Scanner;

public class t_01 {
	public static void cal() {
		Scanner s=new Scanner(System.in);
		System.out.println("-----����-----");
		System.out.println("1.�ӷ�");
		System.out.println("2.����");
		System.out.println("3.�˷�");
		System.out.println("4.����");
		System.out.println("���������:");
		int a=s.nextInt();
		switch (a){
		case 1:
			jia(a);
			break;
		case 2:
			jian(a);
			break;
		case 3:
			chen(a);
			break;
		case 4:
			chu(a);
			break;
		}
		
		
	}
	public static void jia(int c) {
		Scanner s=new Scanner(System.in);
		System.out.println("����������");
		int a=s.nextInt();
		System.out.println("+");
		int b=s.nextInt();
		System.out.println("=");
		System.out.println(a+b);
		check(c);
	}
	public static void jian(int c) {
		Scanner s=new Scanner(System.in);
		System.out.println("����������");
		int a=s.nextInt();
		System.out.println("-");
		int b=s.nextInt();
		System.out.println("=");
		System.out.println(a-b);
		check(c);
	}
	public static void chen(int c) {
		Scanner s=new Scanner(System.in);
		System.out.println("����������");
		int a=s.nextInt();
		System.out.println("x");
		int b=s.nextInt();
		System.out.println("=");
		System.out.println(a*b);
		check(c);
	}
	public static void chu(int c) {
		Scanner s=new Scanner(System.in);
		System.out.println("����������");
		int a=s.nextInt();
		System.out.println("/");
		int b=s.nextInt();
		System.out.println("=");
		System.out.println(a/b);
		check(c);
	}
	public static void check(int a) {
		System.out.println("----------");
		System.out.println("����������0");
		System.out.println("���ز˵�������9");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		if(b==0) {
			switch (a){
			case 1:
				jia(a);
				break;
			case 2:
				jian(a);
				break;
			case 3:
				chen(a);
				break;
			case 4:
				chu(a);
				break;
			}
		}
		cal();
	}
	
	public static void main(String[] args) {
		cal();
	}
}
