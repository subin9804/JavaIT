package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {
	public static void main(String[] args) {
		ListClass4 lc4 = new ListClass4();
		lc4.go();
	}
}

class ListClass4 {
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.print("[1.추가 2.수정 3.제거 4.보기 0.종료]");
//			int num = sc.nextInt();
			
//			if(num == 0) {
//				System.out.println("프로그램 종료");
//				break;
//			}else if(num == 1) {
//				System.out.print("추가할 항목 입력>>");
//				String str1 = sc.next();
//				arr1.add(str1);
//			}else if(num == 2) {
//				System.out.print("수정할 위치를 입력하세요>>");
//				int fix = sc.nextInt();
//				System.out.print("수정내용을 입력하세요>>");
//				String str2 = sc.next();
//				arr1.set(fix, str2);
//			}else if(num == 3) {
//				System.out.print("삭제할 위치를 입력하세요>>");
//				int del = sc.nextInt();
//				arr1.remove(del);
//			}else if(num == 4) {
//				for(int i=0; i<arr1.size(); i++) {
//					System.out.print(arr1.get(i)+" ");
//				}
//				System.out.println();
//			}
//		
//		}
		
		int select = 0;
		String word = null;
		
		while(true) {
			System.out.print("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			select = Integer.parseInt(sc.nextLine());
			
			if(select == 0) {
				System.out.println("프로그램 종료");					break;
				}else if(select ==1) {
					System.out.print("추가할 항목 입력>>");
					word = sc.nextLine();
					arr1.add(word);
				}else if(select == 2) {
					System.out.print("수정할 위치를 입력하세요>>");
					select = Integer.parseInt(sc.nextLine());
					System.out.print("수정할 내용을 입력하세요>>");
					word = sc.nextLine();
					arr1.set(select-1, word);
				}else if(select == 3) {
					System.out.print("삭제할 위치를 입력하세요>>");
					select = Integer.parseInt(sc.nextLine());
					arr1.remove(select-1);
				}else{
					for(int i=0; i<arr1.size(); i++) {
						System.out.print(arr1.get(i)+" ");
					}
					System.out.println();
				}
		}	
	}	
}
