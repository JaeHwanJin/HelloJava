package Board;

public class Reply {

	private int rep_seq;
	private int wId;
	private String rep_content;
	private String rep_writer;
	private String creation_date;

	public Reply(int rep_seq, int wId, String rep_content, String rep_writer, String creation_date) {
		this.rep_seq = rep_seq;
		this.wId = wId;
		this.rep_content = rep_content;
		this.rep_writer = rep_writer;
		this.creation_date = creation_date;

	}

	public int getRep_seq() {
		return rep_seq;
	}

	public void setRep_seq(int rep_seq) {
		this.rep_seq = rep_seq;
	}

	public int getwId() {
		return wId;
	}

	public void setwId(int wId) {
		this.wId = wId;
	}

	public String getRep_content() {
		return rep_content;
	}

	public void setRep_content(String rep_content) {
		this.rep_content = rep_content;
	}

	public String getRep_writer() {
		return rep_writer;
	}

	public void setRep_writer(String rep_writer) {
		this.rep_writer = rep_writer;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	@Override
	public String toString() {
		return "댓글 번호 : " + rep_seq + ",  원본글번호 : " + wId + ", 댓글내용 : " + rep_content + ", 댓글 작성자 : " + rep_writer
				+ ", 댓글 작성일시 : " + creation_date;
	}
}
