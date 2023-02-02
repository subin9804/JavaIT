package Day04;

public class For3 {
	public static void main(String[] args) {
		// #1: 5번 안녕하기
		for(int i=0; i<5; i++) {
			System.out.println("안녕!");
		}
		
		// #3: 1~10까지 합 구하기
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// #4: 10~1까지 거꾸로 출력하기
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		// #5: 0~20 2씩 증가시키면서 출력하기
		for(int i=0; i<=20; i+=2) {
			System.out.println(i);
		}
		
	}
}
