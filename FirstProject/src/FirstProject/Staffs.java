package FirstProject;

public class Staffs {
	private String jobId;
	private String staffId;
	private String staffPwd;
	private String staffTel;
	private String lectName;
	private String staffName;
	
	public Staffs(String staffId, String staffPwd, String staffTel) {
		super();
		this.staffId = staffId;
		this.staffPwd = staffPwd;
		this.staffTel = staffTel;
	}
	
	public Staffs(String staffId, String staffPwd) {
		super();
		this.staffId = staffId;
		this.staffPwd = staffPwd;
	}


	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffPwd() {
		return staffPwd;
	}

	public void setStaffPwd(String staffPwd) {
		this.staffPwd = staffPwd;
	}

	public String getStaffTel() {
		return staffTel;
	}

	public void setStaffTel(String staffTel) {
		this.staffTel = staffTel;
	}

	public String getLectName() {
		return lectName;
	}

	public void setLectName(String lectName) {
		this.lectName = lectName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	@Override
	public String toString() {
		return "[직무: " + jobId + ", 아이디: " + staffId + ", 비밀번호: " + staffPwd + ", 전화번호: " + staffTel
				+ ", 강의명: " + lectName + ", 이름: " + staffName + "]";
	}
	
}
