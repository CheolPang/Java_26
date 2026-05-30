package dbtest;
/*
1. Driver 확인
2. DB 접속
3. DB 요청
4. DB 응답처리
5. DB 접속종료
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class InsertTest {
	// 1. Driver 확인
	public InsertTest() {
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
	public int insertArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("키 입력 : ");
		double height = sc.nextDouble();

		int num = 0;
		String sql = "insert into dbtest values (?,?, ?, sysdate)";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
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

public class Exam02 {
	public static void main(String[] args) {
		InsertTest insertTest = new InsertTest();
		int num = insertTest.insertArticle();
		if(num>0) {
			System.out.println(num+"개 행이 만들어졌습니다.");
		} else {
			System.out.println("저장 실패");
		}
	}
}
