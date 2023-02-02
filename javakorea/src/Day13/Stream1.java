package Day13;

import java.io.File;

public class Stream1 {
	public static void main(String[] args) {
		// Stream: 강, 흐름
		// 데이터를 주고받는 행위(메시지, 파일, ...데이터)
		FileFound ff = new FileFound();
		ff.go("c:\\");
		// 역슬래시(\)2번을 하는 이유: 문자열에서 특정기호를 사용하기 위해선 앞에 \표시를 해줘야함 (ex) \' \" \\
	}
}

class FileFound {
	public void go(String path) {
		System.out.println(path+"안에 있는 파일 검색");
		File file = new File(path);			// File 클래스에 경로를 넘겨줌
		String file_list[] = file.list();	// 모든 파일 목록 배열로 저장
		
		// 가져온 파일 목록을 반복문을 통해 하나씩 보여주기
		for(int i=0; i<file_list.length; i++) {
			System.out.println((i+1)+". "+file_list[i]);
		}
		
		// 빠른 for문 - python형태의 for문으로 배열길이가 정해져있고 의도가 명확할 때 사용할 수 있다.
		for(String str : file_list) {
			if(str.contains(".")){
				System.out.println("폴더명: "+ str);
			}else {
				System.out.println("파일명: "+str);
			}
		}
		
	}
}