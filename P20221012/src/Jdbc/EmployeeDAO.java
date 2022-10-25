package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends DAO{
	
	public void delete(int empId) {
		String sql = "delete from empl where employee_id = ?"; 
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}	
}

	
	public void update(Employee emp) {
		String sql = "update empl "
				+ "set email = ?, "
				+ "    hire_date = ?, "
				+ "    job_id = ? "
				+ "where employee_id = ?";
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getEmail());
			psmt.setString(2, emp.getHireDate());
			psmt.setString(3, emp.getJobId());
			psmt.setInt(4, emp.getEmployeeId());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void insert(Employee emp) {
		String sql = "insert into empl(employee_id, last_name, email, hire_date, job_id)"
				+ "values(" + emp.getEmployeeId()//
				+ ", '" + emp.getLastName()//
				+ "', '" + emp.getEmail()//
				+ "', '" + emp.getHireDate()//
				+ "', '" + emp.getJobId() + "')";//
		
		System.out.println(sql);
		
		conn = getConnect();
		try {
		stmt = conn.createStatement();
		int r = stmt.executeUpdate(sql);
		System.out.println(r + "건이 입력되었습니다.");
		
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			
		}
}

	public List<Employee> search() {
		conn = getConnect();
		List<Employee> list = new ArrayList<>(); // 반환하기 위한 값
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from empl");
			while (rs.next()) {
				list.add(new Employee(rs.getInt("employee_id")//
						, rs.getString("last_name")//
						, rs.getString("email")//
						, rs.getString("hire_date")//
						, rs.getString("job_id")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
		return list;
	}
	
	public Employee getEmp(int empId) {
		//한건만 반환.
		String sql = "select * from empl where employee_id = ?"; 
		conn = getConnect();
		
		Employee emp = null;
		
		try {
			psmt = conn.prepareStatement(sql);		
			psmt.setInt(1, empId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.println("===============================");
				System.out.println("사원번호 : " + rs.getInt("employee_id"));
				System.out.println("이름 : " + rs.getString("first_name"));
				System.out.println("이메일 : " + rs.getString("email"));
				System.out.println("채용일 : " + rs.getString("hire_date"));
				System.out.println("급여 : " + rs.getInt("salary"));
				System.out.println("===============================");
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}	
		return null;
	}

 }

