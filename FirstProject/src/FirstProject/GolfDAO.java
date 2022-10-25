package FirstProject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GolfDAO extends DAO {
	ArrayList<MemberInfo> MemberInfos = new ArrayList<>();
	ArrayList<Staffs> staffs = new ArrayList<>();
	Scanner scn = new Scanner(System.in);

	public void add() {
		System.out.println(" ");
		System.out.print("등록 할 회원의 아이디(숫자6자리)를 입력하세요. -> ");
		int MemId = Integer.parseInt(scn.nextLine());
		System.out.print("등록 할 회원의 이름을 입력하세요. -> ");
		String MemName = scn.nextLine();
		System.out.print("등록 할 회원의 전화번호를 입력하세요. -> ");
		String MemNum = scn.nextLine();
		System.out.print("등록 할 회원의 주소를 입력하세요. -> ");
		String MemAddr = scn.nextLine();
		System.out.print("등록 할 회원의 담당프로 이름을 입력하세요. -> ");
		String MemPro = scn.nextLine();
		System.out.print("등록 할 회원의 회원권 종료일을 입력하세요. -> ");
		String MemEnd = scn.nextLine();
		
		getConnect();
		
		String sql = "insert into Mem (MemID, MemName, MemNum, MemAddr, MemPro, MemEnd) " + //
				" values(?, ?, ?, ?,  ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, MemId);
			psmt.setString(2, MemName);
			psmt.setString(3, MemNum);
			psmt.setString(4, MemAddr);
			psmt.setString(5, MemPro);
			psmt.setString(6, MemEnd);

			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("등록이 완료되었습니다.");
			disconnect();
		}
	}
	
//	// 회원등록
//	public void add() {
//		System.out.println(" ");
//		System.out.print("등록 할 회원의 아이디(숫자6자리)를 입력하세요. -> ");
//		int MemId = Integer.parseInt(scn.nextLine());
//		System.out.print("등록 할 회원의 이름을 입력하세요. -> ");
//		String MemName = scn.nextLine();
//		System.out.print("등록 할 회원의 전화번호를 입력하세요. -> ");
//		String MemNum = scn.nextLine();
//		System.out.print("등록 할 회원의 주소를 입력하세요. -> ");
//		String MemAddr = scn.nextLine();
//		System.out.print("등록 할 회원의 담당프로 이름을 입력하세요. -> ");
//		String MemPro = scn.nextLine();
//		System.out.print("등록 할 회원의 회원권 종료일을 입력하세요. -> ");
//		String MemEnd = scn.nextLine();
//
//		MemberInfo Member = new MemberInfo(MemId, MemName, MemNum, MemAddr, MemPro, MemEnd);
//		MemberInfos.add(Member);
//		DbInsert(MemId, MemName, MemNum, MemAddr, MemPro, MemEnd);
//		System.out.println("등록이 완료되었습니다.");
//		System.out.println(" ");
//	
//	}
//
//	// DB저장
//	public void DbInsert(int MemId, String MemName, String MemNum, 
//			String MemAddr, String MemPro, String MemEnd) {
//		conn = getConnect();
//		String sql = "insert into Mem (MemID, MemName, MemNum, MemAddr, MemPro, MemEnd) " + //
//				" values(?, ?, ?, ?,  ?, ?)";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, MemId);
//			psmt.setString(2, MemName);
//			psmt.setString(3, MemNum);
//			psmt.setString(4, MemAddr);
//			psmt.setString(5, MemPro);
//			psmt.setString(6, MemEnd);
//
//			psmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//	}

	// 회원전체조회
	public void Search() {
		conn = getConnect();
		String sql = "select * from Mem";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("|회원 아이디 : " + rs.getString("MemId") + "| -" + " |회원이름 : " + rs.getString("MemName") + "| -"
						+ " |전화번호 : " + rs.getString("MemNum") + "| -" + " |회원주소 : " + rs.getString("MemAddr") + "| -" + " |담당프로 : "
						+ rs.getString("MemPro") + "| -" + " |종료일 : " + rs.getString("MemEnd") + "|");
				System.out.println(" ");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 회원아이디로 조회
	private int CheckMemberID(int Id) {
		int result = 0;
		conn = getConnect();
		String sql = "select * from Mem where MemId = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, Id);
			rs = psmt.executeQuery();
			if (rs.next() == true) {
				result = 1;
			} else {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 회원상세조회
	public void searchMem() {
		loop: while (true) {
			System.out.print("조회할 회원의 아이디를 입력하세요. -> ");
			int Id = Integer.parseInt(scn.nextLine());
			if (CheckMemberID(Id) == 1) {
				conn = getConnect();
				String sql = "select * from Mem where MemId = ? ";
				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, Id);
					rs = psmt.executeQuery();
					while (rs.next()) {
						System.out.println(" ");
						System.out.println("|회원 아이디 : " + rs.getString("MemId") + "| -"  + " |회원이름 : " + rs.getString("MemName") + "| -"  
								+ " |전화번호 : " + rs.getString("MemNum") + "| -"  + " |회원주소 : " + rs.getString("MemAddr") + "| -" 
								+ " |담당프로 : " + rs.getString("MemPro") + "| -"  + " |종료일 : " + rs.getString("MemEnd") + "|" );
						System.out.println(" ");
						break loop;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					disconnect();
				}
			} else
				System.out.println("존재하지 않는 회원아이디입니다.");// end of if
			break;
		} // end of while
	}

	// 회원정보수정
	public void update() {
		loop: while (true) {
			System.out.print("수정할 회원의 아이디를 입력하세요. -> ");
			int MemId = Integer.parseInt(scn.nextLine());
				if (CheckMemberID(MemId) == 1) {
					System.out.print("수정 할 전화번호를 입력하세요. -> ");
					String num = scn.nextLine();
					System.out.print("수정 할 주소를 입력하세요. -> ");
					String addr = scn.nextLine();
					System.out.print("수정 할 프로의 이름을 입력하세요. -> ");
					String pro = scn.nextLine();
					System.out.print("수정 할 회원권 종료일을 입력하세요. -> ");
					String end = scn.nextLine();

					getConnect();
					
					String sql = "update Mem set MemNum = ?, MemAddr = ?, MemPro = ?, MemEnd =? where MemId = ? ";

					try {
						psmt = conn.prepareStatement(sql);
						psmt.setString(1, num);
						psmt.setString(2, addr);
						psmt.setString(3, pro);
						psmt.setString(4, end);
						psmt.setInt(5, MemId);

						psmt.executeUpdate();
						System.out.println("수정완료.");
						System.out.println(" ");
						break loop;
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						disconnect();
					}
				} else
					System.out.println("존재하지 않는 회원아이디입니다.");
				break;
			}
		}

	// 회원삭제
	public void delete() {	
		loop: while (true) {
		System.out.print("삭제 할 회원의 아이디를 입력하세요. -> ");
		int MemId = Integer.parseInt(scn.nextLine());
			if (CheckMemberID(MemId) == 1) {
				
				getConnect();
				
				String sql = "delete from Mem where MemId =?";

				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, MemId);
					psmt.executeUpdate();
					System.out.println("삭제완료.");
					break loop;
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					disconnect();
				}
			} else
				System.out.println("존재하지 않는 회원아이디입니다.");
			break;
		}
	}
//		}
//		getConnect();
//		System.out.print("삭제할 회원의 아이디를 입력하세요 : ");
//		String Name = scn.nextLine();
//		String sql = "delete from Mem where MemId =?";
//
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, Name);
//			int rs = psmt.executeUpdate();
//			if(rs > 0) {
//				System.out.println("삭제성공");
//				System.out.println(" ");
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//	}

	// 로그인
	public int Login(int menu) {
		int result = 0;
		while (true) {
			if (menu == 1) {
				System.out.println(" ");
				System.out.println("----로그인 화면----");
				System.out.print("ID: ");
				String id = scn.nextLine();
				System.out.print("PW : ");
				String pw = scn.nextLine();
				System.out.println("-----조회 중------");

				conn = getConnect();
				String sql = "select staffId from staff where staffId = ? and staffPwd = ? ";
				try {
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					rs = psmt.executeQuery();
					if (rs.next()) {
						Staffs staff = new Staffs(id, pw);
						staffs.add(staff);
						result = 1;
						break;
					} else {
						System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
						break;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					disconnect();
				}
			} // end
			else if (menu == 2) {
				System.out.println("");
				System.out.println("----로그인 화면----");
				System.out.print("이름 : ");
				String MemName = scn.nextLine();
				System.out.print("회원아이디 : ");
				int MemId = Integer.parseInt(scn.nextLine());
				System.out.println("-----조회 중-----");

				conn = getConnect();
				String sql = "select MemName from Mem where MemName = ? and MemId = ? ";
				try {
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, MemName);
					psmt.setInt(2, MemId);
					rs = psmt.executeQuery();
					if (rs.next()) {
						MemberInfo MemberInfo = new MemberInfo(MemName, MemId);
						MemberInfos.add(MemberInfo);
						result = 2;
						System.out.println();
						break;
					} else {
						System.out.println("이름 또는 생년월일(6자리)이 맞지 않습니다.");
						break;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					disconnect();
				}
			} else
				System.out.println("올바른 메뉴번호를 입력하세요");
		}
		return result;
	}// end 로그인
}
