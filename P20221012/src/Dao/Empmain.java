package Dao;

import java.util.List;

public class Empmain {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		EmployeeVO vo = new EmployeeVO(0, null, null, null, null, null);
		
		List<EmployeeVO> list = dao.empList(vo);
		for(EmployeeVO emp : list) {
			System.out.println(emp);
		}
	}
}
