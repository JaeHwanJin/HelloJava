package Board;

public class BoardExe {
	public static void main(String[] args) {
		
		BoardDao dao = BoardDao.getInstance(); //싱글톤 방식
//		BoardDao dao = new BoardDao();
		dao.exe();
			
		}
	}

