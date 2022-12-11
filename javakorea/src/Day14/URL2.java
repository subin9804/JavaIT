package Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class URL2 {
	public static void main(String[] args) {
		MyURLEx m = new MyURLEx();
		m.go("https://movie.naver.com/movie/sdb/rank/rmovie.naver");
		
		
		
	}
}

class MyURLEx {
	
	InputStream is = null;		// 내 프로그램이 데이터를 가져올 때 InputStream
	InputStreamReader isr = null;		// 문자열 형식이 안맞을 수 있어서 UTF-8로 변환
	BufferedReader br = null;		// 문자열로 바꾸기 위해 버퍼단위로 읽음
	URL url = null;			// HTTP 통신
	String str = null;
	ArrayList<String> parseArray = new ArrayList<>();
	
	public void go(String address) {
		
		try {
			// HTTP통신 (39~47)
			url = new URL(address);
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			// 버퍼리더를 문자열로 변경 (한줄씩 줄바꾸면서)
			while((str = br.readLine()) != null) {		// str에 먼저 한줄씩 담고 null과 같은지 비교. (br.readLine(): 한줄씩 읽기)
				// System.out.println(str);
				// 내가 원하는 문자열을 찾는다
				if(str.contains("<a href=\"/movie/bi/mi/basic.naver?code=") && !(str.contains("onclick"))) {
					String parse = str.substring(str.indexOf("title=")+7, str.indexOf("\">")+0);		// 파싱
					parseArray.add(parse);		// 파싱한 문자열을 ArrayList에 저장
					//System.out.println(str);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				isr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<parseArray.size(); i++) {
			System.out.println((i+1)+"위. "+parseArray.get(i));
		}
	}
}
