package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	public static void main(String[] args) {
		ListClass3 lc3 = new ListClass3();
		lc3.go();
	}
}

class ListClass3 {
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("아메리카노");
		arr1.add("카페라떼");
		arr1.add("카페모카");
		arr1.add("카라멜 마끼아또");	// 추가
		arr1.add(0, "에스프레소");		// 수정
		arr1.set(4, "오렌지주스");		// 삭제
		arr1.remove(4);
		arr1.remove("카페모카");
		
		System.out.println(arr1.indexOf("에스프레소"));	// 위치를 찾아줌
		System.out.println(arr1.get(0));		// 읽기
		System.out.println(arr1.size());
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i)+" ");
		}
		
		ArrayList<String> arr2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("추가할 항목 입력(0을 입력하면 종료)");
			String str = sc.next();
			if(str.equals("0")) {
				break;
			} else {
				arr2.add(str);
			}
		}
		
		for(int i=0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i)+" ");
		}
	}
}