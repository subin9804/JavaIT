package Day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn2 {
	public static void main(String[] args) {
		// 데이터베이스 라이브러리 추가하기
		// 프로젝트 우클릭 -> Properties -> Java Build Path -> Classpath -> Add External JARs...-> mysql-connector-j-8.0.xx.jar 선택
		// MySQL 설치 경로 : C:\\Program Files (x86)\\MySQL\\Connector J 8.0
		MyDB2 db = new MyDB2();
		
		db.connect();
		db.delete();
		
//		db.connect();
//		db.update();
		
//		db.connect();
//		db.insert();
		
		db.connect();
		db.select();
		
	
	}
}

class MyDB2 {
	private Connection conn;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";
	
	static {	// 클래스를 객체화 하는 순간 실행됨
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// Class: 클래스의 정보를 얻어오는 클래스
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void connect() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM worker";		// select All
	
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);	// sql에 저장한 문자열을 쿼리로 실행
			while(rs.next()) {		// 위에서부터 한 행씩 반복문
				int id = rs.getInt("id");	// 첫번째 열의 값
				String name = rs.getString(2);	// 두번째 열의 값
				String gender = rs.getString("gender");		// 세번째 열의 값
				
				System.out.println(id + " " + name + " " + gender);		// 한 행씩 실행할 때마다 출력
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				rs.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insert() {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO worker (name, gender) VAlUES(?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);		// ?에 해당하는 값을 채워줌(pstmt는 뒤늦게 ?를 채워줘도 된다)
			pstmt.setString(1, "pink");		// 첫번째 ?에 문자열 채워넣기
			pstmt.setString(2, "woman");	// 두번째 ?에 문자열 채워넣기
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// update: 수정
	public void update() {
		PreparedStatement pstmt = null;
		String sql = "UPDATE worker SET gender=? WHERE id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "man");
			pstmt.setInt(2, 8);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete() {
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM worker WHERE id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 8);
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}
