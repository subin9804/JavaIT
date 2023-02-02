package Day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection1 {
	public static void main(String[] args) {
		// 데이터베이스와 연동
		// Java 에서 데이터베이스를 사용하기 위해선
		// 해당 SQL의 라이브러리를 가져온다
		
		// 프로젝트 속성 -> Java Build Path -> Libraries -> Classpath -> Add External JARs... -> mysql-connector-java-8.0.31.jar
		// mysql-connector-java-8 경로: C:\\Program Files (x86)\\MySQL\\Connector J 8.0\\
		DBConn db = new DBConn();
	}
}

class DBConn {
	private Connection conn;
	private static final String USERNAME = "root";		// sql 다운받을 때 쓴 이름
	private static final String PASSWORD = "root";		// sql 다운받을 때 쓴 비밀번호
	private static final String URL = "jdbc:mysql://localhost:3306/company";		//스키마명
	
	public DBConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			// com.mysql.jdbc.Driver: 5버전
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("MySQL 드라이버 로딩 성공");
			selectAll();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("MySQL 드라이버 로딩 실패");
			try {conn.close();} catch (SQLException e1) {e1.printStackTrace();}
		}
	}	
	
	public void selectAll() {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM worker";		// SQL문법은 대문자로, 그 외에는 소문자로
			rs = stmt.executeQuery(sql);				// executeQuery(): 쿼리 날리기(sql작성문 전송)
			while(rs.next()) {
				int id = rs.getInt(1);			// 한 행씩 가져오면서 각각 자료형에 맞게 변수로 담는다
				String name = rs.getString(2);
				String gender = rs.getString(3);
				
				System.out.println(id+" "+name+" "+gender);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
				rs.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}