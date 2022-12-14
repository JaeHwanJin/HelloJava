package co.edu.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {

	// 입력
	public EmployeeVO insertEmp(EmployeeVO vo) {
		getConnect();
		String seq = "select employees_seq.nextval from dual";
		
		String sql = "insert into empl (employee_id, first_name, last_name, email, hire_date, job_id)"
				+ "values(?,?,?,?,?,?)";

		try {		
			// seqence 휙득
			int seqInt = 0;
			psmt = conn.prepareStatement(seq);
			rs = psmt.executeQuery();
			if(rs.next()) {
				seqInt = rs.getInt(1);
			}
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getEmployeeId());
			psmt.setString(2, vo.getFirstName());
			psmt.setString(3, vo.getLastName());
			psmt.setString(4, vo.getEmail());
			psmt.setString(5, vo.getHireDate());
			psmt.setString(6, vo.getJobId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨.");
			vo.setEmployeeId(seqInt);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}


	// 삭제
	public void deleteEmp(int employeeId) {
		getConnect();
		String sql = "delete from empl where employee_id = ?"; //
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, employeeId);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 수정
	public void utdateEmp(EmployeeVO vo) {
		getConnect();
		String sql = "update empl set first_name = ?, last_name = ?, email = ?, hire_date = ?, job_id = ?, where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getFirstName());
			psmt.setString(2, vo.getLastName());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getHireDate());
			psmt.setString(5, vo.getJobId());
			psmt.setInt(6, vo.getEmployeeId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 업데이트됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 목록
	public List<EmployeeVO> empList(EmployeeVO vo) {
		List<EmployeeVO> empList = new ArrayList<EmployeeVO>();
		getConnect();
		String sql = "select * from empl"//
				+ " where nvl(employee_id, 0) = decode(?, 0, nvl(employee_id, 0), ?) "//
				+ " and first_name like '%'||?||'%' " //
				+ " and last_name like '%'||?||'%' " //
				+ " and email like '%'||?||'%' " //
				+ " and to_char(hire_date, 'yyyy-mm-dd') like '%'||?||'%' " //
				+ " and job_id = nvl(?, job_id) " //
				+ " order by employee_id";

		try {
			psmt = conn.prepareStatement(sql);
			

			psmt.setInt(1, vo.getEmployeeId());
			psmt.setInt(2, vo.getEmployeeId());
			psmt.setString(3, vo.getFirstName());
			psmt.setString(4, vo.getLastName());
			psmt.setString(5, vo.getEmail());
			psmt.setString(6, vo.getHireDate());
			psmt.setString(7, vo.getJobId());
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				int empId = rs.getInt("employee_id");
				String fName = rs.getString("first_name");
				String lName = rs.getString("last_name");
				String email = rs.getString("email");
				String hDate = rs.getString("hire_date");
				String jobId = rs.getString("job_id");

				EmployeeVO emp = new EmployeeVO(empId, fName, lName, email, hDate, jobId);
				empList.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return empList;
	}
}
