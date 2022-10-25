package Jdbc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmpDbToFile {
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("c:/Temp/empFile.txt");
			EmployeeDAO dao = new EmployeeDAO();
			List<Employee> list = dao.search();
			
			for(Employee emp : list) {
				emp.getEmployeeId();
				emp.getEmployeeId();
				emp.getEmployeeId();
				emp.getEmployeeId();
				emp.getEmployeeId();
				emp.getEmployeeId();
				fw.write("");
				
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("completed");
		

	}
}
