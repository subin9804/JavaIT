package Day04;

public class For2 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i+"번");
		}	// for문에서 초기값은 조건식이 끝나면 사라짐
		
		int i = 0;
		for(; i<10; i++) {
			System.out.println(i+"회");
		}	// 초기값생략
			
	}
}