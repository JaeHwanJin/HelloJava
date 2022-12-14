package Nested;

class Person {

	// 필드
	String name;
	int age;

	// 생성자
	Person() {
	}

	// 메소드
	void showInfo() {
		// 로컬 클래스
		class Local {
			
			void show() {
				System.out.println("show");
			}
		}
	}

	// 중첩클래스, Inner클래스(인스턴스)
	class Car {
		String carName;
		
		void run() {
			System.out.println("run");
		}
	}

	// Inner 클래스(정적)
	static class Calculator {
		void add() {
			System.out.println("add");
		}
	}
	
	// Inner 인터페이스 
	interface Runnabel{
		void rund();
	}
}
	public  class NestedExample {
		public static void main(String[] args) {
			Person p = new Person();

			// 인스턴스 멤버 클래스
			Person.Car car = p.new Car(); // 내부클래스 인스턴스
			car.run();
			
			// 정적 멤버 클래스
			Person.Calculator cal = new Person.Calculator();
			cal.add();
			
			p.showInfo(); // 로컬클래스
		}
	}
