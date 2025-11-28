package Practice3;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 로또 번호 생성기기
//		크기 6의 배열에 1~45 사이의 난수를 넣어 로또 번호를 생성하세요. 단, 중복 없는 난수여야 합니다

		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int number = (int) (Math.random() * 45 + 1);
			boolean dupli = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] == number) {
					dupli = true;
					break;
				}
			}
			// 중복되는 번호인경우 다시 한번 랜덤 번호를 저장하도록 만드는 if문
//			if(dupli) {
//				i--;
//				continue;
//			}
			// 중복되지 않는 경우 번호를 배열에 저장하고 다음 반복으로 진행
//			arr[i] = number;
			if (dupli == false) {
				arr[i] = number;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}

//			int[] arr = new int[6];
//			for (int j = 0; j < i; j++) {
//				if (arr[j] == number) {
//					number = (int) (Math.random() * 45 + 1);
//					j = -1;
//				}
//			}
//			arr[i] = number;
//		}
//		System.out.println("이번주 로또 번호");
//		for (int number : arr) {
//			System.out.print(number + " ");
//		}

