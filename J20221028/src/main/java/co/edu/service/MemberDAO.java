package co.edu.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.common.DAO;
import co.edu.member.MemberVO;
import co.edu.member.calendarVO;

public class MemberDAO extends DAO{
	
//	public List<calendarVO> calendarList(){
//		getConnect();
//		
//	}
	
	//부서명, 부서인원
	public Map<String, Integer> getEmpByDept(){
		getConnect();
		 Map<String, Integer> map = new HashMap<>();
		String sql = "select d.department_name, count(1)\r\n"
				+ "from hr.employees e\r\n"
				+ "join hr.departments d\r\n"
				+ "on e.department_id = d.department_id\r\n"
				+ "group by d.department_name";
		try {
			psmt=conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return map;
	}
	
	// 데이터 한건 삭제
	public boolean deleteMember(String id) {
		getConnect();
		String sql = "delete from members where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			if(r > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}
	
	// 데이터 한건 등록.
	public void insertMember(MemberVO vo) {		
		getConnect();
		String sql = "insert into members (id, passwd, email, name, responsibility)"//
					+ " values(?, ?, ?, ?, 'user')";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getName());
			
			psmt.executeUpdate();
			
			vo.setResponsibility("user");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// 전체목록
	public List<MemberVO> memberList(){
		getConnect();
		List<MemberVO> list = new ArrayList<>();
		String sql = "select * from members order by id asc";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setResponsibility(rs.getString("responsibility"));
				
				list.add(vo);
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

}

