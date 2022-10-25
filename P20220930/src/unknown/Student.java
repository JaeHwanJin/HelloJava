package unknown;

import java.io.ObjectOutputStream.PutField;
import java.util.Arrays;

public class Student {
	
	@Override
	public String toString() {
		return "Student [classof=" + classof + ", name=" + name + ", major=" + major + ", age=" + age + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}

	private String classof;
	private String name;
	private String major;
	private int age;
	private String[] hobbies = new String[5];
	
	
//	정적메서드
	public static void staticMethod() {
		System.out.println("staticMethod call");
		
	}
	
	// get / set
	void setClassof(String classof) {
		this.classof = classof;
	}
	String getClassof() {
		return this.classof;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	
	void setMajor(String major) {
		this.major = major;
	}
	
	String getmajor() {
		return this.major;
	}
	
	void setage(int age) {
		if(age < 0 ) {
			this.age = 0; //
		}
		else {
			this.age = age;
		}
	}
	
	int getage() {
		return this.age;
	}
	
	// 생성자(필드의 값을 초기화) 생성자 오버로딩(동일한 이름의 생성자를 여러번 정의)
	public Student() {
		// 매개값이 없는 생성자 => 기본생성자.
		this.name = "기본값";
		this.classof = "000-000";
	}
	
	public Student(String classof, String name) {
		this.classof = classof;
		this.name = name;
	}
	
	public Student(String classof, String name, String major) {
		this(classof, name); //기본생성자 호출
		this.major = major;
	}
	
	
	
	//메소드 반드시 반환타입 지정
	void setHobbies(String[] hobbies){
//		this.hobbies = hobbies;
		for(String hobby : hobbies) {
			for(int i = 0; i < this.hobbies.length; i++) {
				if(this.hobbies[i] == null) {
				   this.hobbies[i] = hobby;
				   break;
				}
			}
		}
	}
	
	// 배열
	
	String[] gethobbies() {
		return this.hobbies;
	}
	String gethobbies2() {
		String str = "취미는 ";
		for(String hob : hobbies) {
			if(hob != null)
			str += hob + " ";
		}
		str += "입니다.";
		return str;
	}
	
	// 취미 추가
	
	void addhobby(String hobby) {
		for(int i = 0; i < hobbies.length; i++) {
			if(hobbies[i] == null) {
				hobbies[i] = hobby;
				break;
			}
		}
			
	}
	
	// showInfo()  이름 학번 전공 출력
	
	public String showInfo() {
	
		return "이름은 " + this.name + ", 학번은 " + this.classof + ", 전공은 " +
				this.major + "입니다.";
		
	}
	
	void Study() {
		System.out.println(name + "은(는) 전공과목인 " + major + "을(를) 공부하고 있습니다.");
	}
	
	void PlayGame(String gamename ) {
		System.out.println(name + "은(는) " + gamename + " 을(를) 플레이하고 있습니다.");
	}
	
	void sleep() {
		System.out.println(name + "은(는) 방에서 잠을 잡니다.");
	}
}
