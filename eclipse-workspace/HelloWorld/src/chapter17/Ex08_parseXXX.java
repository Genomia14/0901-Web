package chapter17;

public class Ex08_parseXXX {

	public static void main(String[] args) {
		String str = "100";
//	String을 int 자료형으로 변경하는 메서드
		int a = Integer.parseInt(str);
//	String을 double 자료형으로 변경하는 메서드
		double b = Double.parseDouble("3.14");
		System.out.println(a + " : " + b);
	}

}
