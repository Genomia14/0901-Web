package chapter2;

public class Ex01_VariableType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		// -128 ~ 127까지 저장 가능	
		short s = 32767;
		// -32768 ~ 32767
		int i = 2147483647;
		// 숫자를 저장할때 가장 많이 사용하는 자료형
		// -21억 ~ +21억까지 저장 가능
		// -2147483648 ~ 2147483647		
		long l = 9223372036854775807L;
		// -9223372036854775808 ~ 9223372036854775807
		// 21억을 넘는 값의 경우 대문자 L을 붙여서 사용
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
	 	System.out.println(l);
	 	
	 	// 실수 자료형 float(4), double(8)
	 	double num1 = 1.00000001;
	 	System.out.println(num1);
	 	double num2 = 2.00000001;
	 	System.out.println(num2);
	 	// 자바의 부동 소수점 방식은 소수점 숫자 계산이 정확하지 않다.
	 	double result = num1 + num2;
	 	System.out.println(result);
	 	// float 자료형은 뒤에 f를 붙여야 한다.	 	
	 	float f = 1.1001f;
	 	System.out.println(f);
	}
}
