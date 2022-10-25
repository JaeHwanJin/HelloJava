package Inherit.friend;

public class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("강아지가 고기를 먹습니다.");
	}
	
	@Override
	public void speak() {
		System.out.println("멍! 멍!.");
	}
}
