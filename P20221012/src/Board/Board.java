package Board;

public class Board {

	private int wId;
	private String wName;
	private String wContents;
	private String Writer;
	private String DW;
	private int NR;
	
	public Board(int wId, String wName, String wContents,
					String Writer, String DW, int NR) {
		this.wId = wId;
		this.wName =wName;
		this.wContents = wContents;
		this.Writer = Writer;
		this.DW = DW;
		this.NR = NR;
		
	}
	
	

	public int getwId() {
		return wId;
	}



	public void setwId(int wId) {
		this.wId = wId;
	}



	public String getwName() {
		return wName;
	}



	public void setwName(String wName) {
		this.wName = wName;
	}



	public String getwContents() {
		return wContents;
	}



	public void setwContents(String wContents) {
		this.wContents = wContents;
	}



	public String getWriter() {
		return Writer;
	}



	public void setWriter(String writer) {
		Writer = writer;
	}



	public String getDW() {
		return DW;
	}



	public void setDW(String dW) {
		DW = dW;
	}



	public int getNR() {
		return NR;
	}



	public void setNR(int nR) {
		NR = nR;
	}



	@Override
	public String toString() {
		return "글 번호 : " + wId + ", 글 이름 : " + wName + 
				", 글 내용 : " + wContents + ", 작성자 : "  + Writer +
				", 작성일시 : " + DW + ", 읽은 횟수 : " + NR; 
	}


}

