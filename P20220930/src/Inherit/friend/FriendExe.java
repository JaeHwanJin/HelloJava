package Inherit.friend;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendExe {
	
Scanner scn = new Scanner(System.in);
ArrayList friend = new ArrayList();

// 친구등록 - 학교/회사/친구...
public void exe() {
	
	while(true) {
		
		System.out.println("1.등록 2.조회 3.종료");
		System.out.println("선택 >> ");
		
		int menu = scn.nextInt();
		scn.nextLine();
	
		if(menu == 1) {
			System.out.println("1.회사친구 2.학교친구 3.친구");
			int subMenu = scn.nextInt();
			scn.nextLine();
			if(subMenu == 1) {
				addComFriend();
			}
			else if(subMenu == 2) {
				addUnivFriend();
			}
			else if(subMenu == 3) {
				addFriend();
			}
			
		}
		
		else if(menu == 2){
			searchFriend();
		}
		else if(menu == 3){
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		else {
			System.out.println("잘못된 메뉴를 선택했습니다.");
		}
	}
	System.out.println("프로그램 종료.");
	} // end of exe()	

	// 추가메소드.
	public void addComFriend() {
		
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phone = scn.nextLine();
		System.out.println("회사명을 입력하세요.");
		String company = scn.nextLine();
		System.out.println("부서명을 입력하세요.");
		String dept = scn.nextLine();
		ComFriend comFrnd = new ComFriend(name, phone, company, dept);
		friend.add(comFrnd); //비워져있는 위치에 자동으로 알아서 한건 등록
//		for(int i = 0; i < friends.length; i++) {
//			if(friends[i] == null) {
//				friends[i] = comFrnd;
//				break;
//			}
//		}
	}
		
	public void addUnivFriend() {
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phone = scn.nextLine();
		System.out.println("학교명을 입력하세요.");
		String univ = scn.nextLine();
		System.out.println("전공명을 입력하세요.");
		String major = scn.nextLine();
		UnivFriend univFrnd = new UnivFriend(name, phone, univ, major);
		friend.add(univFrnd);
//		for(int i = 0; i < friends.length; i++) {
//			if(friends[i] == null) {
//				friends[i] = univFrnd;
//				break;
//			}
//		}
	}
	
	public void addFriend() {
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phone = scn.nextLine();
		
	}
	
	public void searchFriend() {
		System.out.println("조회 할 사람의 이름을 입력하세요.");
		String searchKey = scn.nextLine();
		
		for(int i = 0; i < friend.size(); i++) {
			// Friend 클래스의 상속. Friend, ComFriend, UnivFriend
			Object frnd = friend.get(i);
			if(frnd instanceof Friend) { // frnd 변수의 타입이 어떤 유형의 클래스인지
			Friend friend = (Friend) frnd;
			System.out.println(friend.showInfo());
			}
			else if(frnd instanceof ComFriend) {
				ComFriend friend = (ComFriend) frnd;
				System.out.println(friend.showInfo());
			}
			else if(frnd instanceof UnivFriend) {
				UnivFriend friend = (UnivFriend) frnd;
				System.out.println(friend.showInfo());
			}

		}
//		for(int i = 0; i < friends.length; i++) {
//			if(friends[i] != null && friends[i].getName().contains(searchKey)) {
//				System.out.println(friends[i].showInfo());
				
			}	
		
}




//public class FriendExe {
//	
//	Scanner scn = new Scanner(System.in);
//	Friend[] friends = new Friend[10];
//	
//	// 친구등록 - 학교/회사/친구...
//	public void exe() {
//		
//		while(true) {
//			
//			System.out.println("1.등록 2.조회 3.종료");
//			System.out.println("선택 >> ");
//			
//			int menu = scn.nextInt();
//			scn.nextLine();
//		
//			if(menu == 1) {
//				System.out.println("1.회사친구 2.학교친구 3.친구");
//				int subMenu = scn.nextInt();
//				scn.nextLine();
//				if(subMenu == 1) {
//					addComFriend();
//				}
//				else if(subMenu == 2) {
//					addUnivFriend();
//				}
//				else if(subMenu == 3) {
//					addFriend();
//				}
//				
//			}
//			else if(menu == 2){
//				searchFriend();
//			}
//			else if(menu == 3){
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			else {
//				System.out.println("잘못된 메뉴를 선택했습니다.");
//			}
//		}
//		System.out.println("프로그램 종료.");
//		} // end of exe()	
//	
//		// 추가메소드.
//		public void addComFriend() {
//			
//			System.out.println("이름을 입력하세요.");
//			String name = scn.nextLine();
//			System.out.println("전화번호를 입력하세요.");
//			String phone = scn.nextLine();
//			System.out.println("회사명을 입력하세요.");
//			String company = scn.nextLine();
//			System.out.println("부서명을 입력하세요.");
//			String dept = scn.nextLine();
//			ComFriend comFrnd = new ComFriend(name, phone, company, dept);
//			for(int i = 0; i < friends.length; i++) {
//				if(friends[i] == null) {
//					friends[i] = comFrnd;
//					break;
//				}
//			}
//		}
//			
//		public void addUnivFriend() {
//			System.out.println("이름을 입력하세요.");
//			String name = scn.nextLine();
//			System.out.println("전화번호를 입력하세요.");
//			String phone = scn.nextLine();
//			System.out.println("학교명을 입력하세요.");
//			String univ = scn.nextLine();
//			System.out.println("전공명을 입력하세요.");
//			String major = scn.nextLine();
//			UnivFriend univFrnd = new UnivFriend(name, phone, univ, major);
//			for(int i = 0; i < friends.length; i++) {
//				if(friends[i] == null) {
//					friends[i] = univFrnd;
//					break;
//				}
//			}
//		}
//		
//		public void addFriend() {
//			System.out.println("이름을 입력하세요.");
//			String name = scn.nextLine();
//			System.out.println("전화번호를 입력하세요.");
//			String phone = scn.nextLine();
//			
//		}
//		
//		public void searchFriend() {
//			System.out.println("조회 할 사람의 이름을 입력하세요.");
//			String searchKey = scn.nextLine();
//			for(int i = 0; i < friends.length; i++) {
//				if(friends[i] != null && friends[i].getName().contains(searchKey)) {
//					System.out.println(friends[i].showInfo());
//					
//				}
//			}	
//		}
//  
//	
//}
//
