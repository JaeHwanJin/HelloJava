package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAO {

	public static void main(String[] args) {
		// jdbc driver로드
		search();

	}
	
	public static void update() {
		Connection conn = null;
		Statement stmt = null;
//		ResultSet rs = null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		stmt = conn.createStatement();
		int r = stmt.executeUpdate("update empl set first_name = 'messi' where employee_id = 500 "); // insert, update delete 가능
		System.out.println(r + "건이 업데이트되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
//				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
	}

	
	public static void delete() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		stmt = conn.createStatement();
		int r = stmt.executeUpdate("delete from empl where employee_id = 550"); // insert, update delete 가능
		System.out.println(r + "건이 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
//				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
	}
	
	public static void search(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			stmt = conn.createStatement(); // 실행쿼리문을 전송하고 결과를 받아오도록 하는 객체.
			rs = stmt.executeQuery("select * from Pro");
			// select의 경우 executeQuery 
			
			// Set 컬렉션
			while (rs.next()) {
				System.out.println("사원번호 : " + rs.getInt("employee_id"));
				System.out.println("이름 : " + rs.getString("first_name"));
				System.out.println("급여 : " + rs.getInt("salary"));
				System.out.println("====================================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 예외 발생해도 정상처리
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료.");
	}
}
