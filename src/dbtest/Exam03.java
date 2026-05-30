package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class SelectTest {
	// 1. Driver 확인
	public SelectTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
		}
	}

	// 2. DB 접속
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "C##dbexam";
		String password = "m1234";
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("==DB 접속 성공==");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("==DB 접속 실패==");
		}
		return conn;
	}

	// 3. DB 요청 4. DB 응답처리 5. DB 접속종료
	public List<DbtestDTO> selectArticle() {
		List<DbtestDTO> list = new ArrayList<DbtestDTO>();
		String sql = "select * from dbtest";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// DB에 요청하고 응답처리
			rs = pstmt.executeQuery(); // sql문을 실행하는 코드 // read일 떄만 executeQuery()
			// 응답결과 처리
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				String logtime = rs.getString("logtime");
				DbtestDTO dto = new DbtestDTO(name, age, height, logtime);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 접속 종료
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}

public class Exam03 {
	public static void main(String[] args) {
		SelectTest selectTest = new SelectTest();
		List<DbtestDTO> list = selectTest.selectArticle();
		for (int i = 0; i < list.size(); i++) {
			DbtestDTO dto = list.get(i);
			System.out.println(dto);
		}
	}
}
