package Day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// 입력받은 나라의 수도를 알려주는 프로그램 만들기
		// 국가, 수도
		
		// 어느 나라의 수도가 궁금하신가요?
		// 미국의 수도는 워싱턴 입니다
		Scanner sc = new Scanner(System.in);
		String answer = null;
		
		String in;		// 사용자로부터 입력받는 값을 저장할 변수
		int index = 0;	// 입력받은 문자열의 값과 동일한 문자열의 위치를 백업해둘 변수
		
		String nations[] = {"한국", "미국", "중국", "일본", "영국"};
		String cities[] = {"서울", "워싱턴", "베이징", "도쿄", "런던"};

		
		while(true) {
			System.out.println("어느 나라의 수도가 궁금하신가요?");
			answer = sc.next();
			if(answer.equals(nations[0])){
				System.out.println(answer+"의 수도는 "+cities[0]+"입니다.");
			}else {
				for(int i=0; !(answer.equals(nations[i])); i++ ){
					index = i;
				}
				System.out.println(answer+"의 수도는 "+cities[index+1]+"입니다.");
				System.out.println();
			}
		}
				
				
	
	}
}