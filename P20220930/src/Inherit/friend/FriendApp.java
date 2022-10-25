package Inherit.friend;

public class FriendApp {
	public static void main(String[] args) {
		
		// 친구.
		Friend frnd = new Friend("홍길동", "010-1111-2222");
//		frnd.setName("홍길동");
//		frnd.setPhone("010-1111-2222");
		
		UnivFriend univFrnd = new UnivFriend("김민규", "010-2222-3333",
											 "대구대", "역사학과");
		
		ComFriend comfrnd = new ComFriend("유재석", "010-3333-4444",
										  "MBC", "미디어부서");
		
		Friend[] friends = new Friend[5];
		friends[0] = frnd;
		friends[1] = univFrnd;
		friends[2] = comfrnd;
		
		for(Friend friend : friends) {
			if(friend != null)
			System.out.println(friend.showInfo());
		}
	}
}
 