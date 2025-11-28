package Test2;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	private String address;

	public Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}

	void print() {
		System.out.println(name + " " + tel + " " + address);
	}
}

class PhoneManager {
	private Phone[] phone;
	private int count;

	public PhoneManager(int size) {
		phone = new Phone[size];
		count = 0;
	}
}

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문제 2");
		System.out.println("종료하려면 exit를 입력하십시오");
		System.out.println();

		System.out.print("인원수 >> ");
		int co = sc.nextInt();
		Phone[] phones = new Phone[co];

		for (int i = 0; i < co; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
			String name = sc.next();
			String tel = sc.next();
			String address = sc.next();
			phones[i] = new Phone(name, tel, address);
		}
		System.out.println("저장되었습니다.");

		while (true) {
			System.out.print("검색할 이름 >> ");
			String search = sc.next();

			if (search.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다...");
				break;
			}

			boolean found = false;
			for (Phone p : phones) {
				if (p.getName().equals(search)) {
					System.out.println(p.getName() + "의 번호와 주소는 " + p.getTel() + "," + p.getAddress() + "입니다.");
					found = true;
					break;
				}
			}
		}
	}
}
