package Practice7;

// 칼로리, 가격, 중량
class Food {
	private int cal;
	private int cost;
	private int kg;

	Food(int cal, int cost, int kg) {
		this.cal = cal;
		this.cost = cost;
		this.kg = kg;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}
}

// 경작 농원 정보
class Melon extends Food {
	private String info;

	Melon(int cal, int cost, int kg, String info) {
		super(cal, cost, kg);
		this.info = info;

	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	void print() {
		System.out.println("칼로리 = " + getCal() + "cal");
		System.out.println("가격 = " + getCost() + "원");
		System.out.println("무게 = " + getKg() + "kg");
		System.out.println("물건 = " + getInfo());
	}
}

public class Q4 {

	public static void main(String[] args) {
		Melon melon = new Melon(100, 1000, 1, "사과");
		melon.print();
//		4. 일반적인 음식을 나타내는 Food 클래스를 상속받아서 멜론을 나타내는 Melon 클래스를
//		작성하여 보자. Food 클래스는 칼로리, 가격, 중량 등의 정보를 가진다. Melon 클래스는
//		추가로 경작 농원 정보를 가진다. 생성자, 접근자, 설정자를 포함하여서 각각의 클래스를
//		작성한다. 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래
//		스를 작성하라. 

	}

}
