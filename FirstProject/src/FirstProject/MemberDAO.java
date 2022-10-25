package FirstProject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO extends DAO {

	
	// 입력
	public MemberInfo insertEmp(MemberInfo mi) {
		getConnect();
		String seq = "select employees_seq.nextval from dual";
		
		String sql = "insert into empl (MemId, MemName, MemBir, MemNum, MemAddr, MemPro, MemEnd)"
				+ "values(?,?,?,?,?,?,?)";

		try {		
			// seqence 휙득
			int seqInt = 0;
			psmt = conn.prepareStatement(seq);
			rs = psmt.executeQuery();
			if(rs.next()) {
				seqInt = rs.getInt(1);
			}
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, mi.getMemId());
			psmt.setString(2, mi.getMemName());
			psmt.setString(3, mi.getMemNum());
			psmt.setString(4, mi.getMemAddr());
			psmt.setString(6, mi.getMemPro());
			psmt.setString(7, mi.getMemEnd());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨.");
			mi.setMemId(seqInt);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect(); 	
		}
		return mi;
	}


	// 삭제
	public void deleteMem(int MemId) {
		getConnect();
		String sql = "delete from Mem where MemId = ?"; //
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, MemId);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	// 수정
	public void utdateMem(MemberInfo mi) {
		getConnect();
		String sql = "update Mem set MemBir = ?, MemNum = ?, MemAddr = ?, MemPro = ?, MemEnd =?  where MemName = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mi.getMemNum());
			psmt.setString(2, mi.getMemAddr());
			psmt.setString(3, mi.getMemPro());
			psmt.setString(4, mi.getMemEnd());
			psmt.setString(5, mi.getMemName());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 업데이트됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 목록
	public List<MemberInfo> MemList(MemberInfo mi) {
		List<MemberInfo> MemList = new ArrayList<MemberInfo>();
		getConnect();
		String sql = "select * from Mem"//
				+ " where MemId like '%'||?||'%' "//
				+ " and MemName like '%'||?||'%' " //
				+ " and MemBir like '%'||?||'%' " //
				+ " and MemNum like '%'||?||'%' " //
				+ " and MemAddr like '%'||?||'%' " //
				+ " and MemPro like '%'||?||'%' " //
				+ " and MemEnd like '%'||?||'%' " //
				+ " order by MemId";

		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, mi.getMemId());
			psmt.setString(2, mi.getMemName());
			psmt.setString(3, mi.getMemNum());
			psmt.setString(4, mi.getMemAddr());
			psmt.setString(5, mi.getMemPro());
			psmt.setString(6, mi.getMemEnd());
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				int MemId = rs.getInt("MemId");
				String MemName = rs.getString("MemName");
				String MemNum = rs.getString("MemNum");
				String MemAddr = rs.getString("MemAddr");
				String MemPro = rs.getString("job_id");
				String MemEnd = rs.getString("job_id");
				MemberInfo Mem = new MemberInfo(MemId, MemName, MemNum, MemAddr, MemPro, MemEnd);
				MemList.add(Mem);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return MemList;
	}
}
