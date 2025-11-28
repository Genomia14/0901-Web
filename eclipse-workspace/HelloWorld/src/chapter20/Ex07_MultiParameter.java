package chapter20;

class Camp7<T1, T2> {
	private T1 param1;
	private T2 param2;

	public void set(T1 o1, T2 o2) {
		param1 = o1;
		param2 = o2;
	}

	@Override
	public String toString() {
		return param1 + " & " + param2;
	}
}

public class Ex07_MultiParameter {

	public static void main(String[] args) {
		Camp7<String, Integer> camp = new Camp7<>();
		camp.set("Apple", 25);
		System.out.println(camp);

//	Camp7에 String, Double을 저장하는 camp2만들기
		Camp7<String, Double> camp1 = new Camp7<>();
		camp1.set("Apple", 2.5);
		System.out.println(camp1);

//	Camp7에 Integer, String을 저장하는 camp3만들기
		Camp7<Integer, String> camp2 = new Camp7<>();
		camp2.set(100, "abc");
		System.out.println(camp2);

//	Camp7에 Long, Byte를 저장하는 camp4만들기
		Camp7<Long, Byte> camp3 = new Camp7();
		camp3.set(123456789L, (byte) 1);
		System.out.println(camp3);

	}

}
