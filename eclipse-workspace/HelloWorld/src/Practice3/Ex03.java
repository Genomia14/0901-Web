package Practice3;

public class Ex03 {
	
	public static void main(String[] args) {
//	3. 합계 & 평균 구하기
//	학생 점수가 들어있는 배열이 주어질 때, 점수들의 합과 평균을 구하세요.
//	int[] studentArr = {100,50,70,90,100,60,30,10,50};
		
		int[] studentArr = {100,50,70,90,100,60,30,10,50};
		int sum = studentArr[0] + studentArr[1] + 
							studentArr[2] + studentArr[3] + 
							studentArr[4] + studentArr[5] + 
							studentArr[6] + studentArr[7] + 
							studentArr[8];
		
		double avg = (double)sum / (double)9;
		System.out.println("합 = " + sum);
		System.out.println("평균 = " + avg);
		
//	int sum = 0;
//	double avg = 0.0;
//	for(int i:studentArr){
//	sum+=i;
//	int avg = sum/studentArr.length;
//	System.out.println("합 = " + sum);
//	System.out.println("평균 = " + avg);
//	}
		
//	stream을 이용한 총합 구하기
//	sum = Arrays.stream(studentArr).sum();
//	stream을 이용한 평균 구하기
//	avg = Integer.parseInt(Arrays.stream(studentArr).average().toString;
//	System.out.println("합 = " + sum);
//	System.out.println("평균 = " + avg);
	}
}
