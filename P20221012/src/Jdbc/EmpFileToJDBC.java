package Jdbc;
//package co.edu.jbdc;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//
//public class EmpFileToJDBC {
//	public static void main(String[] args) {
//
//		EmployeeDAO dao = new EmployeeDAO();
//
//		String[] emps = null;
//		Employee employee = null;
//		EmployeeDAO dao1 = new EmployeeDAO();
//
//		try(
//			FileReader fr = new FileReader("C:/Temp/emplist.txt");
//			BufferedReader br = new BufferedReader(fr);
//			)
//			{
//			while(true) {
//				String emp = br.readLine();
//				if(emp == null)
//				break;
//				
//				emps = emp.split(" ");
//				employee =new Employee(Integer.parseInt(emps[0]), emp[1], emp[2], emp[3], emp[4]) { 
//				dao.insert(employee);
//			}
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println("completed");
//	}
