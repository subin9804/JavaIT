package Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map3 {
	public static void main(String[] args) {
		Map3Impl map = new Map3Impl();
		map.go();
	}
}

class Map3Impl {
	private HashMap<String, String> hm = new HashMap<>();
	
	public void go() {
		// 영한사전 -> 국가별 수도
		// 국가를 입력하세요(0을 입력하면 전체보기) >> 한국
		// 한국: 서울
		Set<String> set = null;
		Iterator<String> it = null;
		
		hm.put("한국", "서울"); 
		hm.put("미국", "워싱턴"); 
		hm.put("태국", "방콕"); 
		hm.put("대만", "타이페이"); 
		hm.put("체코", "프라하"); 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국가를 입력하세요(0을 입력하면 전체보기)>> ");
		String nation = sc.nextLine();
		
		if (nation.equals("0")) {
			set = hm.keySet();
			it = set.iterator();
			while(it.hasNext()) {
				String country = it.next();
				System.out.println(country+":"+hm.get(country));
			}
		} else if (nation.equals("") || nation == null) {
			System.out.println("입력하지 않았습니다.");
		} else if(hm.containsKey(nation) == true) {		
			System.out.println(nation+":"+hm.get(nation));
		} else {
			System.out.println("없는 국가입니다.");
		}
		sc.close();
		
		
	}
}