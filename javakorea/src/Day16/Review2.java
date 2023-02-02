package Day16;

public class Review2 {
	public static void main(String[] args) {
		// 제어문: 조건문, 반복문, 기타제어문
		// 조건문: if, switch
		// 반복문: while, for
		// 기타제어문: break, continue, goto
		
		String str = null;
		int num = 0;
		
		// if문
		if(1 != 1) {
			System.out.println("이 문장은 항상 무시가 됩니다.");
		}
		
		// if ~ else if ~ else
		if(str == null) {
			System.out.println("문자열은 비어있습니다.");
		}else if(str.equals("")) {
			System.out.println("빈 문자열이 들어있습니다.");
		}else {
			System.out.println(str);
		}
		
		// switch ~ case ~ break: 동일한 값을 비교할 때
		switch(num) {
		case 0:
			System.out.println("0 입니다.");
		case 1:
			System.out.println("1 입니다.");
		default:
			System.out.println("그 밖에");
		}
		
		// 반복문 while
		while(num < 3) {
			System.out.println("num은 3보다 작다");
			num++;
		}
		
		// for문 (C언어 형태)
		for(int i=0; i<3; i++) {
			System.out.println("i는 3보다 작다");
		}
		
		// 빠른 for문 (python 현태): 배열전용
		int arr[] = {0, 1, 2, 3, 4, 5};
		for(int j:arr) {
			System.out.print(j + " ");
		}
		System.out.println();			// 줄변경
		for(int k=0; k<arr.length; k++) {
			System.out.print(k + " ");
		}
		System.out.println();			// 줄변경
		
		// 기타제어문
		// break: 반복문을 종료한다(반복문 취소)
		// continue: 더이상 아래 코드를 실행하지 않고 반복문 처음으로 돌아감(1회성 취소)
		for(int x=0; x<10; x++) {
			if(x == 3) {
				// break;
				continue;
			}
			System.out.println(x+" ");
		}
		System.out.println();
		// 이중반복문
		for(int a=0; a<3; a++) {
			for(int b=0; b<2; b++) {
				System.out.println("a: "+a+", b: "+b);
			}
		}	
	}
}
