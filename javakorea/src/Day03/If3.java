package Day03;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		int password;
		
		System.out.println("아이디를 입력하세요>>>");
		id = sc.next();
		System.out.println("비밀번호를 입력하세요>>>");
		password = sc.nextInt();
		
		if(!(id.equals("hello")) || !(password == 1234)) {
			System.out.println("없는 아이디이거나 패스워드 입니다.");
		}else {
			System.out.println("로그인 성공");
		}
		
	}
}
