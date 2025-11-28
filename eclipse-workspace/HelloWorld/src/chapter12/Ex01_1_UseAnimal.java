package chapter12;

class Animal {
	// 맴버 변수 : name, age
	// 메서드 : eat(), move()
	String name;
	int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void eat() {
		System.out.println(name + "가 음식을 먹습니다");
	}

	void move() {
		System.out.println(name + "가 움직입니다.");
	}

	void nomal() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
//	void Crow(){
//		System.out.println(name + "");
//	}
}

class Cat extends Animal {
	// 메서드 : meow() : 고양이가 야옹하고 웁니다.

	Cat(String name, int age) {
		super(name, age);
		System.out.println();
	}

	void meow() {
		System.out.println("고양이가 야옹하고 웁니다.");
	}
// eat()메서드를 오버라이딩 하여 고양이는 천천히 먹습니다 출력하도록 변경
	@Override
	void eat() {
		System.out.println("고양이는 천천히 먹습니다.");
	}
	
// move()메서드를 오버라이딩하여 고양이는 조용히 움직입니다 출력하도록 변경
	@Override
	void move() {
		System.out.println("고양이는 조용히 움직입니다.");
	}
}

class Dog extends Animal {
	// 메서드 : bark() : 강아지가 멍멍하고 웁니다.

	Dog(String name, int age) {
		super(name, age);
		System.out.println();
	}

// eat()를 실행하면 먹습니다. 주인의 허락이 떨어져야 먹습니다.
	@Override
	void eat() {
		super.eat(); // 강아지가 음식을 먹습니다
		System.out.println("주인의 허락이 떨어져야 먹습니다."); // 주인의 허락이 떨어져야 먹습니다.
	}
// move()를 실행하면 움직입니다. 산책할때는 더 빠르게 움직입니다.
	@Override
	void move() {
		super.move();
		System.out.println("산책할때는 더 빠르게 움직입니다.");
	}
	
	void bark() {
		System.out.println("강아지가 멍멍하고 웁니다.");
	}
}

public class Ex01_1_UseAnimal {

	public static void main(String[] args) {
		Cat Cat = new Cat("고양이", 6);
//		String name = "고양이";
//		int age = 6;
//		System.out.println(name  + "의 나이 : " + age);
		Cat.nomal();
		Cat.eat();
		Cat.move();
		Cat.meow();

		Dog Dog = new Dog("강아지", 3);
		Dog.nomal();
		Dog.eat();
		Dog.move();
		Dog.bark();

	}

}
