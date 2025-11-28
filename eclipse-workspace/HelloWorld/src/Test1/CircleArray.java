package Test1;

import java.util.Scanner;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}
}

public class CircleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문제1");
		System.out.println();

		Circle[] circle = new Circle[4];
		double sum = 0.0;

		for (int i = 0; i < circle.length; i++) {
			System.out.print(i + 1 + " 반지름 >> ");
			double ri = sc.nextDouble();
			circle[i] = new Circle((int) ri);

		}
		for (int i = 0; i < circle.length; i++) {
			sum += circle[i].getArea();
		}
		System.out.println("저장하였습니다...");
		System.out.println("원의 면적 전체 합은 " + (double) sum);
	}
}
