package Day11;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		// ArrayList, HashMap, (HashSet)
		// 객체화
		ListClass1 Ic1 = new ListClass1();
		
		// go 사용
		Ic1.go();
	}
}

class ListClass1 {
	public void go() {
		// int ==> Integer
		// double ==> Double
		ArrayList<Integer> arr1 = new ArrayList<>();
		//배열
		int num[] = new int [10];
		
		// 값 대입
		num[0] = 1;
		arr1.add(1);		// 방을 만들면서 값 대입
		
		num[1] = 2;
		arr1.add(2);
		
		num[2] = 3;
		arr1.add(3);
		
		// 수정
		num[1] = 22;
		arr1.set(1, 22);
		
		// 삽입 1번방과 2번방 사이에
		arr1.add(2, 123);		// 기존 2번방에 있던 값을 뒤로 밀어내고 2번방에 새로운 값을 삽입
		for(int i=num.length-1; i>2; i--) {
			if(i != num.length-1) {
				num[i] = num[i-1];
			}
		}
		num[2] = 123;
		
		// 1번방을 없애고 싶다.(ArrayList)
		arr1.remove(1);
		
		// 1번방을 없애고 싶다.(배열)
		for(int i=1; i<num.length; i++) {
			if(i != num.length-1) {
				num[i] = num[i+1];
			}
		}
		num[num.length-1] = 0;

//		 배열을 전체보기
		for(int i=0; i<num.length; i++) {
			if(num[i] != 0 ) {
				System.out.println(num[i]);
			}
		}
		
//		 ArrayList 전체보기
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
	}
}