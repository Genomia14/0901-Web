package chapter22;

class HumanCamp2 {
	private int speed = 10;

	public void getMarine() {
//	지역 내부 클래스(로컬 이너 클래스) : 해당 메서드 안에서만 쓸 수 있는 클래스
		class Marine2 {
			public void move() {
				System.out.println("인간형 유닛이 " + speed + " 속도로 이동합니다.");
			}
		}
		Marine2 inner = new Marine2();
		inner.move();
	}

}

public class Ex02_LocalInner {

	public static void main(String[] args) {
		HumanCamp2 hc = new HumanCamp2();
		hc.getMarine();
		
	}

}
