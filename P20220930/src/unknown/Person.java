package unknown;

// 사람 : 속성(이름, 나이, 키, 몸무게)
// 사람 : 기능(달린다, 먹는다, 잔다)
public class Person {
	
	// 클래스안에서는 속성 = 필드
	String name;
	int age;
	double height;
	double weight;
	
//(리턴값)	 (이름)	
// 클래스안에서는 기능 = 메서드
	void run() {
		System.out.println(name + "이(가) 달립니다.");
	} //자바스크립트처럼 출력하고자하는 속성(필드)과 기능(메서드)를 입력
	
	void eat(String food) {
		System.out.println(name + "이(가) " + food + "을(를) 먹습니다.");
	}
	
	void sleep() {
		System.out.println(name + "이(가) 잠을 잡니다.");
	}	
	
}

