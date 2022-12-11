package Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class URL3 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		URL url = null;
		String str = null;
		String myWord = null;
		ArrayList<String> coffee = new ArrayList<>();
		
		// 내가 특정 페이지에서 원하는 문자열만 가져와 출력하기
		try {
			url = new URL("https://paikdabang.com/menu/menu_coffee/");
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			while((str = br.readLine()) != null) {
				if(str.contains("<p class=\"menu_tit\"")) {
					if(str.contains("8217")){
						myWord = str.substring(str.indexOf(";s")+3,str.indexOf("</p>"));
					} else {
						myWord = str.substring(str.indexOf("tit\">")+5,str.indexOf("</p>"));
					}
					coffee.add(myWord);
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
		for(int i=0; i<coffee.size(); i++) {
			System.out.println(i+". "+coffee.get(i));
		}
	}
}
