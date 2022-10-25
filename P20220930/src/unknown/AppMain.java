package unknown;


// 하나의 실행클래스(main 메서드)와 여러개의 라이브러리클래스 필요
public class AppMain {
	public static void main(String[] args) {
		// Object -< Class -> Instance
		
		Person kim = new Person(); //Person클래스를 불러와 kim이라는 인스턴스를 생성)
		kim.name = "김민기"; // Person클래스의 속성(필드)과 기능(메서드)을 불러올 수 있다.
		kim.age	 = 20;
		kim.sleep();
		kim.eat("치킨");
		kim.run();
		
		
		Person lee = new Person();
		lee.name = "이순신";
		lee.age = 20;
		lee.sleep();
		lee.eat("피자");
		lee.run();
		
		
		Student jin = new Student();
		
		jin.setClassof("21500478");
		jin.setName("진재환");
		jin.setMajor("사회복지");
		
		
//		jin.classof = 21500478;
//		jin.name = "진재환";
//		jin.major = "Programing";
//		jin.Study();
//		jin.PlayGame("Overwatch");
//		jin.sleep();
		
		Student choi = new Student();
		
		choi.setClassof("21500245");
		choi.setName("최지은");
		choi.setMajor("사회복지");
		
//		choi.classof = 21500245;
//		choi.name = "최지은";
//		choi.major = "Social welfare";
//		choi.Study();
//		choi.PlayGame("Overwatch");
//		choi.sleep();
		
		Student choo = new Student();
		
		choo.setClassof("21500000");
		choo.setName("Susan Choo");
		choo.setMajor("cat");
		
//		choo.classof = 21500111;
//		choo.name = "Susan choo";
//		choo.major = "Sleep";
//		choo.Study();
//		choo.PlayGame("Hurting mouse");
//		choo.sleep();
		
//		Student[] students;
//		students = new Student[] {jin, choi, choo};
//		for(Student familly : students) {
//			System.out.println("학번 : " + familly.getClassof()  + 
//								", 학생이름 : " + familly.getName());
//		}
				
//		상속
		
		Workman wman = new Workman();
		wman.name = "직장인";
		wman.age = 30;
		
		Studentman sman = new Studentman();
		sman.school = "예담직업학교";
		sman.height = 181;
		
	}
}
