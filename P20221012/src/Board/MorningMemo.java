package Board;

import java.io.Serializable;

public class MorningMemo implements Serializable {

	private String id ;
	private String name;
	private int point;
	
	public MorningMemo(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	// getter/ setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "아이디 : " + id + ", 이름 : " + name + ", 포인트 : " + point;
	}
}
