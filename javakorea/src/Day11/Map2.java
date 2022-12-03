package Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map2Impl map = new Map2Impl();
		map.go();
		map.tester();
	}
}

class Map2Impl {
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		// 단어 5개. 영한사전
		hm.put("cat", "고앵");
		hm.put("rabbit", "토깽");
		hm.put("dog", "강아지");
		hm.put("duck", "덕");
		hm.put("tiger", "호랭");
		
	}
	
	public void tester() {
		Scanner sc = new Scanner(System.in);
		String word_eng = null, word_kor = null;
		System.out.print("[영한사전]검색할 단어를 입력하세요>>");
		word_eng = sc.nextLine();
		word_kor = hm.get(word_eng);
		if(word_kor == null || word_kor.equals("")) {
			System.out.println("없는 단어입니다.");
		}else {
			System.out.println("뜻: "+word_kor);
		}
		
	}
}


