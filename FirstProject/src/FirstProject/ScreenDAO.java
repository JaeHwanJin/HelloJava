package FirstProject;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ScreenDAO extends DAO {
	ArrayList<ScreenInfo> ScreenInfos = new ArrayList<>();
	Scanner scn = new Scanner(System.in);
	String datePattern = "yyyyMMdd";
	SimpleDateFormat format = new SimpleDateFormat(datePattern);
	
	// 스크린 예약
	public void Reservation() {
		System.out.println(" ");
		System.out.print("회원아이디를 입력하세요. -> ");
		int ScrId = Integer.parseInt(scn.nextLine());
		System.out.print("예약 할 날짜를 입력하세요. -> ");
		String Dates = scn.nextLine();
		System.out.print("예약 할 시간을 입력하세요. -> ");
		String Times = scn.nextLine();
		System.out.print("방문 할 인원을 입력하세요. -> ");
		String Nop = scn.nextLine();
		System.out.print("예약 할 방 번호를 입력하세요. -> ");
		String RoomNum = scn.nextLine();

		ScreenInfo Screen = new ScreenInfo(ScrId, Dates, Times, Nop, RoomNum);
		ScreenInfos.add(Screen);
		DbInsert(ScrId, Dates, Times, Nop, RoomNum);
		System.out.println("등록이 완료되었습니다.");
	}

	// DB저장
	public void DbInsert(int ScrId, String Dates, String Times, String Nop, String RoomNum) {
		conn = getConnect();
		String sql = "insert into Scr (ScrId, Dates, Times, Nop, RoomNum) " + //
				" values(?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, ScrId);
			psmt.setString(2, Dates);
			psmt.setString(3, Times);
			psmt.setString(4, Nop);
			psmt.setString(5, RoomNum);

			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 예약자명으로 조회
	private int checkmember(int ScrId) {
		int result = 0;
		conn = getConnect();
		String sql = "select * from Scr where ScrId = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, ScrId);
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

	// 예약내역조회
	public void searchScr() {
		loop: while (true) {
			System.out.print("조회 할 예약자아이디 입력: ");
			
			int ScrName = Integer.parseInt(scn.nextLine());
			if (checkmember(ScrName) == 1) {
				conn = getConnect();
				String sql = "select * from Scr where ScrId = ? ";
				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, ScrName);
					rs = psmt.executeQuery();
					while (rs.next()) {
						System.out.println("예약자아이디 : " + rs.getString("ScrId") + " 예약 날짜 : " + rs.getString("Dates") + ", 예약시간 : "
								+ rs.getString("Times") + ", 방문인원 : " + rs.getString("Nop") + ", 방번호 : " + rs.getString("RoomNum") + "\n");
						break loop;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					disconnect();
				}
			} else
				System.out.println("존재하지 않는 예약자 입니다.");// end of if
			break;

		} // end of while
	}

	// 예약 변경
	public void update() {
		loop: while (true) {
			System.out.print("예약자아이디를 입력하세요. -> ");
			int ScrId = Integer.parseInt(scn.nextLine());
				if (checkmember(ScrId) == 1) {
					System.out.print("변경 할 예약일을 입력하세요. -> ");
					String Dates = scn.nextLine();
					System.out.print("변경 할 예약시간을 입력하세요. -> ");
					String Times = scn.nextLine();
					System.out.print("변경 할 방문인원수를 입력하세요. -> ");
					String Nop = scn.nextLine();
					System.out.print("변경 할 방번호를 입력하세요. -> ");
					String RoomNum = scn.nextLine();
					getConnect();

					String sql = "update Scr set Dates = ?, Times = ?, Nop = ?, RoomNum = ? where ScrId = ?";
					try {
						psmt = conn.prepareStatement(sql);
						psmt.setString(1, Dates);
						psmt.setString(2, Times);
						psmt.setString(3, Nop);
						psmt.setString(4, RoomNum);
						psmt.setInt(5, ScrId);

						psmt.executeUpdate();
						System.out.println("수정완료.");
						break loop;
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						disconnect();
					}
				} else
					System.out.println("존재하지 않는 회원이름입니다.");
			}
		}
	

	// 예약 취소
	public void delete() {
		loop: while (true) {
		System.out.print("삭제 할 회원의 아이디를 입력하세요. -> ");
		int ScrId = Integer.parseInt(scn.nextLine());

			if (checkmember(ScrId) == 1) {
				
				getConnect();
				
				String sql = "delete from Scr where ScrId =?";

				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, ScrId);
					psmt.executeUpdate();
					System.out.println("삭제완료.");
					break loop;
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					disconnect();
				}
			} else
				System.out.println("존재하지 않는 예약입니다.");
			break;
		}
	}
}
	
//		getConnect();
//		System.out.print("삭제할 회원의 아이디를 입력하세요 : ");
//		int ScrId = Integer.parseInt(scn.nextLine());
//		String sql = "delete from Scr where ScrId =?";
//
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, ScrId);
//			int rs = psmt.executeUpdate();
//			if(rs > 0) {
//				System.out.println("삭제성공");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//	}
//}
