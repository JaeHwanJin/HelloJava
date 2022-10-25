package FirstProject;

public class ScreenInfo {

	private int ScrId;
	private String Dates;
	private String Times;
	private String Nop;
	private String RoomNum;
	
	public ScreenInfo(int ScrId, String Dates, String Times, String Nop, String RoomNum) {
		super();
		this.ScrId = ScrId;
		this.Dates = Dates;
		this.Times = Times;
		this.Nop = Nop;
		this.RoomNum = RoomNum;
	}
	
	public ScreenInfo(String Dates) {
	super();
	this.Dates = Dates;
	}


	public int getScrId() {
		return ScrId;
	}

	public void setScrId(int scrId) {
		ScrId = scrId;
	}

	public String getDate() {
		return Dates;
	}

	public void setDate(String date) {
		Dates = date;
	}

	public String getTime() {
		return Times;
	}

	public void setTime(String time) {
		Times = time;
	}

	public String getNop() {
		return Nop;
	}

	public void setNop(String nop) {
		Nop = nop;
	}

	public String getRoomNum() {
		return RoomNum;
	}

	public void setRoomNum(String roomNum) {
		RoomNum = roomNum;
	}
	
}
