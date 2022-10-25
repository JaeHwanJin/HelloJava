package Inherit;

public class Parent extends Object{ // 기본적으로 모든클래스는 Object를 상속
	String field;
	Parent(){
		System.out.println("Parent() call.");
	}
	Parent(String args){
		System.out.println("Parent(String args) call.");
	}
	
	void method() {
		System.out.println("Parent method() call.");
	}
}
