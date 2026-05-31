package dbtest.self;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DBInit {
	public DBInit() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "C##dbexam";
		String password = "m1234";
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("[INFO] DB에 접속했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("==DB 접속 실패==");
		}
		return conn;
	}

	// 3. DB 요청 4. DB 응답처리 5. DB 접속종료
	public int UserAddArticle(String ID, String PW, String NM) {
		String sql = "insert into users values (?,?, ?, 0, 0, sysdate)";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setString(1, ID);
			pstmt.setString(2, PW);
			pstmt.setString(3, NM);
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
			System.out.println("[INFO] DB에 요청하는 중입니다.");
			conn.prepareStatement("commit").executeUpdate();
			System.out.println("[INFO] DB를 커밋하는 중입니다.");
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

	public int UserDelArticle(String ID, String PW) {
		String sql = "delete users where ID=? AND PW=?";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setString(1, ID);
			pstmt.setString(2, PW);
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
			System.out.println("[INFO] DB에 요청하는 중입니다.");
			conn.prepareStatement("commit").executeUpdate();
			System.out.println("[INFO] DB를 커밋하는 중입니다.");
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

	public int UserIdUpdate(String ID, String NID, String PW) {
		String sql = "update users set ID=? where ID=? AND PW=?";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setString(1, NID);
			pstmt.setString(2, ID);
			pstmt.setString(3, PW);
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
			System.out.println("[INFO] DB에 요청하는 중입니다.");
			conn.prepareStatement("commit").executeUpdate();
			System.out.println("[INFO] DB를 커밋하는 중입니다.");
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

	public int UserPwUpdate(String ID, String PW, String NPW) {
		String sql = "update users set PW=? where ID=? AND PW=?";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setString(1, NPW);
			pstmt.setString(2, ID);
			pstmt.setString(3, PW);
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
			System.out.println("[INFO] DB에 요청하는 중입니다.");
			conn.prepareStatement("commit").executeUpdate();
			System.out.println("[INFO] DB를 커밋하는 중입니다.");
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

	public int UserNmUpdate(String ID, String PW, String NNM) {
		String sql = "update users set NM=? where ID=? AND PW=?";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setString(1, NNM);
			pstmt.setString(2, ID);
			pstmt.setString(3, PW);
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
			System.out.println("[INFO] DB에 요청하는 중입니다.");
			conn.prepareStatement("commit").executeUpdate();
			System.out.println("[INFO] DB를 커밋하는 중입니다.");
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

	public int UserWarnAdd(String ID, int WARN) {
		String sql = "update users set WARN=WARN+? where ID=?";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setInt(1, WARN);
			pstmt.setString(2, ID);
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
			System.out.println("[INFO] DB에 요청하는 중입니다.");
			conn.prepareStatement("commit").executeUpdate();
			System.out.println("[INFO] DB를 커밋하는 중입니다.");
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

	public int UserWarnDel(String ID, int WARN) {
		String sql = "update users set WARN=WARN-? where ID=?";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setInt(1, WARN);
			pstmt.setString(2, ID);
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
			System.out.println("[INFO] DB에 요청하는 중입니다.");
			conn.prepareStatement("commit").executeUpdate();
			System.out.println("[INFO] DB를 커밋하는 중입니다.");
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

	public int UserPermBan(String ID) {
		String sql = "update users set BAN=1 where ID=?";
		// DB 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			// 요청, 응답 객체 생성
			pstmt = conn.prepareStatement(sql);
			// pstmt 객체 설정
			pstmt.setString(1, ID);
			// DB에 요청하고 응답처리
			num = pstmt.executeUpdate(); // sql문을 실행하는 코드
			System.out.println("[INFO] DB에 요청하는 중입니다.");
			conn.prepareStatement("commit").executeUpdate();
			System.out.println("[INFO] DB를 커밋하는 중입니다.");
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

	public List<UserDTO> selectArticle() {
		List<UserDTO> list = new ArrayList<UserDTO>();
		String sql = "select * from users";
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
				String ID = rs.getString("ID");
				String PW = rs.getString("PW");
				String NM = rs.getString("NM");
				int WARN = rs.getInt("WARN");
				int BAN = rs.getInt("BAN");
				String DATE = rs.getString("logtime");
				UserDTO dto = new UserDTO(ID, PW, NM, WARN, BAN, DATE);
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

public class UserModUtility {
	public static void main(String[] args) {
		DBInit dbInit = new DBInit();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=== 유저 관리 유틸리티 ===");
			System.out.println("-- 계정 관리 --");
			System.out.println("1.유저 추가\n2.유저 삭제\n3.유저 ID 변경\n4.유저 PW 변경\n5.유저 닉네임 변경");
			System.out.println();
			System.out.println("-- 활동 관리 --");
			System.out.println("6.경고 추가\n7.경고 삭제\n8.영구 차단");
			System.out.println();
			System.out.println("-- 정보 --");
			System.out.println("9.유저 목록");
			System.out.println();
			System.out.println("-- 프로그램 --");
			System.out.println("10.프로그램 종료");
			System.out.println("------------");
			System.out.print("실행할 작업 번호를 입력하세요 : ");
			int key = sc.nextInt();
			String ID, PW, NM, NID, NPW, NNM;
			int WARN;
			switch (key) {
			case 1:
				System.out.println("------------");
				System.out.print("ID 입력 : ");
				ID = sc.next();
				System.out.print("PW 입력 : ");
				PW = sc.next();
				System.out.print("닉네임 입력 : ");
				NM = sc.next();
				System.out.println("------------");
				int num = dbInit.UserAddArticle(ID, PW, NM);
				if (num > 0) {
					System.out.println("[INFO] 유저 " + num + "명이 추가되었습니다. / 추가된 유저: " + ID);
					System.out.println("------------");
				} else {
					System.out.println("[ERROR] 유저가 추가되지 않았습니다. DB 상태를 확인해주세요.");
					System.out.println("------------");
				}
				break;
			case 2:
				System.out.println("------------");
				System.out.print("ID 입력 : ");
				ID = sc.next();
				System.out.println("비밀번호 입력 : ");
				PW = sc.next();
				System.out.println("------------");
				int num2 = dbInit.UserDelArticle(ID, PW);
				if (num2 > 0) {
					System.out.println("[INFO] 유저 " + num2 + "명이 삭제되었습니다. / 삭제된 유저: " + ID);
					System.out.println("------------");
				} else {
					System.out.println("[ERROR] 유저가 삭제되지 않았습니다. 존재하는 유저인지 확인해주세요.");
					System.out.println("------------");
				}
				break;
			case 3:
				System.out.println("------------");
				System.out.print("ID 입력 : ");
				ID = sc.next();
				System.out.println("비밀번호 입력 : ");
				PW = sc.next();
				System.out.print("새 ID 입력 : ");
				NID = sc.next();
				int num3 = dbInit.UserIdUpdate(ID, NID, PW);
				if (num3 > 0) {
					System.out.println("[INFO] 유저 " + num3 + "명의 ID가 변경되었습니다. / 변경된 유저: " + ID + "->" + NID);
					System.out.println("------------");
				} else {
					System.out.println("[ERROR] 유저 ID가 변경되지 않았습니다. 존재하는 유저인지, 비밀번호가 정확한지 확인해주세요.");
					System.out.println("------------");
				}
				break;
			case 4:
				System.out.println("------------");
				System.out.print("ID 입력 : ");
				ID = sc.next();
				System.out.print("현재 비밀번호 입력 : ");
				PW = sc.next();
				System.out.print("새 비밀번호 입력 : ");
				NPW = sc.next();
				int num4 = dbInit.UserPwUpdate(ID, PW, NPW);
				if (num4 > 0) {
					System.out.println(
							"[INFO] 유저 " + num4 + "명의 비밀번호가 변경되었습니다. / 변경된 유저: " + ID + " : " + PW + "->" + NPW);
					System.out.println("------------");
				} else {
					System.out.println("[ERROR] 유저 비밀번호가 변경되지 않았습니다. 존재하는 유저인지, 현재 비밀번호가 정확한지 확인해주세요.");
					System.out.println("------------");
				}
				break;
			case 5:
				System.out.println("------------");
				System.out.print("ID 입력 : ");
				ID = sc.next();
				System.out.print("비밀번호 입력 : ");
				PW = sc.next();
				System.out.print("새 닉네임 입력 : ");
				NNM = sc.next();
				int num5 = dbInit.UserNmUpdate(ID, PW, NNM);
				if (num5 > 0) {
					System.out.println("[INFO] 유저 " + num5 + "명의 닉네임이 변경되었습니다. / 변경된 유저: " + ID + " : (" + NNM + ")");
					System.out.println("------------");
				} else {
					System.out.println("[ERROR] 유저 닉네임이 변경되지 않았습니다. 존재하는 유저인지, 비밀번호가 정확한지 확인해주세요.");
					System.out.println("------------");
				}
				break;
			case 6:
				System.out.println("------------");
				System.out.print("ID 입력 : ");
				ID = sc.next();
				System.out.print("경고 추가 횟수 : ");
				WARN = sc.nextInt();
				int num6 = dbInit.UserWarnAdd(ID, WARN);
				if (num6 > 0) {
					System.out.println(
							"[INFO] 유저 " + num6 + "명에게 경고가 추가되었습니다. / 추가된 유저: " + ID + " : (경고 " + WARN + "회 추가됨.)");
					System.out.println("------------");
				} else {
					System.out.println("[ERROR] 유저 경고가 추가되지 않았습니다. 존재하는 유저인지 확인해주세요.");
					System.out.println("------------");
				}
				break;
			case 7:
				System.out.println("------------");
				System.out.print("ID 입력 : ");
				ID = sc.next();
				System.out.print("경고 삭제 횟수 : ");
				WARN = sc.nextInt();
				int num7 = dbInit.UserWarnDel(ID, WARN);
				if (num7 > 0) {
					System.out.println(
							"[INFO] 유저 " + num7 + "명의 경고가 삭제되었습니다. / 삭제된 유저: " + ID + " : (경고 " + WARN + "회 삭제됨.)");
					System.out.println("------------");
				} else {
					System.out.println("[ERROR] 유저 경고가 삭제되지 않았습니다. 존재하는 유저인지 확인해주세요.");
					System.out.println("------------");
				}
				break;
			case 8:
				System.out.println("------------");
				System.out.print("ID 입력 : ");
				ID = sc.next();
				int num8 = dbInit.UserPermBan(ID);
				if (num8 > 0) {
					System.out.println("[INFO] 유저 " + num8 + "명이 영구 차단되었습니다. / 영구 차단된 유저: " + ID);
					System.out.println("------------");
				} else {
					System.out.println("[ERROR] 유저가 영구 차단되지 않았습니다. 존재하는 유저인지 확인해주세요.");
					System.out.println("------------");
				}
				break;
			case 9:
				System.out.println("------------");
				List<UserDTO> list = dbInit.selectArticle();
				for (int i = 0; i < list.size(); i++) {
					UserDTO dto = list.get(i);
					System.out.println(dto);
				}
				break;
			case 10:
				System.out.println("[EXIT] 프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("[ERROR] 번호를 잘못 입력하였습니다. 다시 입력해주세요.");
				System.out.println("------------");
				break;
			}
		}
	}
}