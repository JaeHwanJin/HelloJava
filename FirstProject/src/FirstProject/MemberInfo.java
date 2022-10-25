package FirstProject;

public class MemberInfo {

	// 회원 이름, 회원 전화번호, 회원 주소, 담당프로
	
	private int MemId;
	private String MemName;
	private String MemNum;
	private String MemAddr;
	private String MemPro;
	private String MemEnd;
	
	public MemberInfo(int MemId, String MemName, String MemNum,//
					  String MemAddr, String MemPro, String MemEnd) {
		super();
		this.MemId = MemId;
		this.MemName = MemName;
		this.MemNum = MemNum;
		this.MemAddr = MemAddr;
		this.MemPro = MemPro;
		this.MemEnd = MemEnd;
	}
	
	
	MemberInfo(String MemName, int MemId){
			super();
			this.MemName = MemName;
			this.MemId = MemId;
	}

	
	public int getMemId() {
		return MemId;
	}

	public void setMemId(int memId) {
		MemId = memId;
	}

	public String getMemName() {
		return MemName;
	}

	public void setMemName(String MemName) {
		MemName = MemName;
	}
	
	public String getMemNum() {
		return MemNum;
	}

	public void setMemNum(String MemNum) {
		MemNum = MemNum;
	}

	public String getMemAddr() {
		return MemAddr;
	}

	public void setMemAddr(String MemAddr) {
		MemAddr = MemAddr;
	}

	public String getMemPro() {
		return MemPro;
	}

	public void setMemPro(String MemPro) {
		MemPro = MemPro;
	}
	
	public String getMemEnd() {
		return MemEnd;
	}


	public void setMemEnd(String memEnd) {
		MemEnd = memEnd;
	}

}
