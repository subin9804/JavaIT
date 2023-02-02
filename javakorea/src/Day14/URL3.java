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
		ArrayList<String> arr = new ArrayList<>();
		
		try {
			url = new URL("https://paikdabang.com/menu/menu_coffee/");
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			while((str = br.readLine()) != null) {
				//System.out.println(str);
				if(str.contains("<p class=\"menu_tit\"")) {
					if(str.contains("8217")) {
						myWord = str.substring(str.indexOf(";s")+3, str.indexOf("</p>"));
					} else {
						myWord = str.substring(str.indexOf("tit\">")+5, str.indexOf("</p>"));
					}
					arr.add(myWord);
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
		for(int i=0; i<arr.size(); i++) {
			System.out.println((i+1)+". "+arr.get(i));
		}
		
	}
}

