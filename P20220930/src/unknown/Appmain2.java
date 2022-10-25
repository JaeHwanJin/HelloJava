package unknown;

public class Appmain2 {

	public static void main(String[] args) {
		
		Student.staticMethod();
		
		Math.random();
		Math.round(.5);
		
		Student s1 = new Student();
//		s1.staticMethod(); //error 아닌데 warning
		
		s1.setClassof("111-111");
		s1.setMajor("컴퓨터공학");
		s1.setName("홍길동");
		s1.setage(20);
		
//		System.out.println(s1.getClassof());
//		System.out.println(s1.getage());
		System.out.println(s1.showInfo());
		
		System.out.println("여기 ---> + s1");
		
		Student s2 = new Student();
		
		s2.setClassof("111-222");
		s2.setMajor("전자공학");
		s2.setName("청길동");
		s2.setage(21);
		
		System.out.println(s2.showInfo());

		Student s3 = new Student();
		
		System.out.println(s3.getName());
	
		Student s4 = new Student("111+234", "주소영");
		System.out.println(s4.showInfo());
		
		Student s5 = new Student("222-222", "송지은", "역사학과");
		System.out.println(s5.showInfo());
		
		
		String[] hobby = {"독서", "자전거", "영화보기"};
		s1.setHobbies(hobby);
		s1.addhobby("음악듣기");
		System.out.println(s1.gethobbies2());
		
		System.out.println(s2.gethobbies2());
		
	
	
		
	}


	
}
