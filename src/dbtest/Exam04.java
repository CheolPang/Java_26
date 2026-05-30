package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class UpdateTest {
	// 1. Driver 확인
	public UpdateTest() {
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
	public int updateArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("(수정)이름 : ");
		String name = sc.next();

		String sql = "update dbtest set age=age+1 where name like ?";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setString(1, '%' + name + '%');
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
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
		return num;
	}
}

public class Exam04 {
	public static void main(String[] args) {
		UpdateTest updateTest = new UpdateTest();
		int num = updateTest.updateArticle();
		if (num > 0) {
			System.out.println(num + "개 행의 나이가 업데이트 되었습니다.");
		} else {
			System.out.println("업데이트 실패");
		}
	}
}
