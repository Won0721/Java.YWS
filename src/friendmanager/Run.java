package friendmanager;

public class Run {
	public static void main(String[] args) {
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		HighFriend high = new HighFriend();
		UnivFriend univ = new UnivFriend();
		
		handler.addFriendInfo(high);
		handler.addFriendInfo(univ);
		
		handler.showAllsimpleData();
		
	
		
	}

}
