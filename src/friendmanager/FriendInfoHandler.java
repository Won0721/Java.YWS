package friendmanager;

public class FriendInfoHandler {
	// 컴파일러에선 대학"친구"건 고등학교"친구"건 똑같은 "친구"로 생각한다
	private Friend[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	public void addFriendInfo(Friend fren) {
		// TODO Auto-generated method stub
		myFriends[numOfFriends++] = fren;

	}
	
	public void showAllsimpleData() {
		for(int i =0; i<numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println();
		}
	}

	public Friend[] getMyFriends() {
		return myFriends;
	}

	public void setMyFriends(Friend[] myFriends) {
		this.myFriends = myFriends;
	}

	public int getNumOfFriends() {
		return numOfFriends;
	}

	public void setNumOfFriends(int numOfFriends) {
		this.numOfFriends = numOfFriends;
	}
	
	
	
}
