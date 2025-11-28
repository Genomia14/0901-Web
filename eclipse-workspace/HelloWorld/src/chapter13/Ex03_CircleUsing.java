package chapter13;

// import : 패키지를 매번 적기에는 불편하기 때문에 import 를 이용하여 해결
import com.company.area.Circle;
// import 기능으로는 다른 패키지의 같은 이름의 클래스를 불러오는 것은 불가능
// import com.company.circumference.Circle;
import com.company.*; // com.company 안에있는 모든 클래스를 임포트
// 컴파일시 실제로 사용하는 클래스만 임포트 하기 때문에 걱정없이 사용 가능
// Ctrl + Shif + o : 자동 임포트 단축키
public class Ex03_CircleUsing {

	public static void main(String[] args) {
//  위에서 import 를 사용하여 패키지를 불러오기 때문에 패키지명을 적을 필요가 없음
		Circle c1 = new Circle(3.5);
		System.out.println("반지름 3.5 원 넓이 : " + c1.getArea());
//	위에서 area 의 Circle 클래스를 불러오기 때문에 같은 이름의
//	circumference 패키지의 Circle 은 패키지명을 전부 적어야 에러가 발생하지 않음
		com.company.circumference.Circle c2 = new com.company.circumference.Circle(3.5);
		System.out.println("반지름 3.5 원 둘레 : " + c2.getCircumference());
	}
}
