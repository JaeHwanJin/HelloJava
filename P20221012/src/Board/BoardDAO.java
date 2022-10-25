package Board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// c(reate)r(ead)u(pdate)d(elete)
public class BoardDAO extends DAO {

	public void insert(Board wr) {
		String sql = "insert into board(wId, wName, wContents, Writer, DW, NR)" 
				+ "values(" + wr.getwId()//
				+ ", '" + wr.getwName()//
				+ "', '" + wr.getwContents()//
				+ "', '" + wr.getWriter()//
				+ "', '" + wr.getDW()//
				+ "', '" + wr.getNR() + "')";//

		System.out.println(sql);

		conn = getConnect();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);
			System.out.println(a + "건이 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
	}

	public void update(int wId, String wContents) {
		String sql = "update board set wContents = ?  where wId = ? ";
//		 + " wContents = ?, " + " Writer = ? "
//			+ "where DW = ?" + "where NR = ?"
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, wContents);
			psmt.setInt(2, wId);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void delete(int wId) {
		String sql = "delete from board where wId = ?";
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, wId);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public List<Board> search() {
		conn = getConnect();
		List<Board> list = new ArrayList<>(); // 반환하기 위한 값
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from board"); 
			while (rs.next()) {
				list.add(new Board(rs.getInt("wId")//
						, rs.getString("wName")//
						, rs.getString("wContents")//
						, rs.getString("Writer")//
						, rs.getString("DW")//
						, rs.getInt("NR")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
		return list;
	}

	public Board getEmp(int wId) {
		// 한건만 반환.
		String sql = "select * from board where wId = ?";
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, wId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.println("===============================");
				System.out.println("글 번호 : " + rs.getInt("wId"));
				System.out.println("글 제목 : " + rs.getString("wName"));
				System.out.println("글 내용 : " + rs.getString("wContents"));
				System.out.println("글 작성자 : " + rs.getString("Writer"));
				System.out.println("작성일시 : " + rs.getString("DW"));
				System.out.println("읽은 횟수 : " + rs.getInt("NR"));
				System.out.println("===============================");
				cnt();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}
	
	public void cnt() {
		// 한건만 반환.
		String sql = "update board set NR = NR + 1 ";
		conn = getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();				

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void reply() {
		// 한건만 반환.
		String sql = "select * from reply ";
		conn = getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();				

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}


