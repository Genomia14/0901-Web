package chapter16;

import java.util.Scanner;

public class Ex08_WhyThrow {
	public static void MyMethod1() {
		try {
			MyMethodA();
		} catch (Throwable e) {
			System.out.println("error");
		}
	}

	public static void MyMethod2() {
		try {
			MyMethodA();
		} catch (Throwable e) {
			System.out.println("에러");
		}
	}

// 예외 미루기를 이용하여 같은 코드를 여러번 작성하지 않도록 설정
	public static void MyMethodA() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 10 / num1;
		System.out.println(num2);
	}

	public static void MyMethodB() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 10 / num1;
		System.out.println(num2);
	}

	public static void MyMethodC() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 10 / num1;
		System.out.println(num2);
	}

	public static void main(String[] args) {
//	미루기를 이용하여 메서드에서 일어날 예외의 처리 결과를 다르게 실행하기
		MyMethod1();
		MyMethod2();

//	미루기를 이용하여 하나의 try catch문으로 예외처리하기
		try {
			MyMethodA();
			MyMethodB();
			MyMethodC();
		} catch (Throwable e) {
			System.out.println("MyMethod A,B,C중에서 예외 발생");
		}
	}
}
