package friendmanager;

public abstract class Friend {
	private String name;
	private String phoneNUm;
	private String addr;
	
		public void showDate() {
			System.out.println("이름 : "  + name);
			System.out.println("폰번호 : "  + phoneNUm);
			System.out.println("주소 : "  + addr);
		}
	
	
		public abstract void showBasicInfo();

}
