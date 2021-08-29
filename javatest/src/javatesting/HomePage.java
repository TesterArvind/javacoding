package javatesting;

public class HomePage {
	
	public HomePage sendFriend() {
		
		System.out.println("friend request sent");
		return this;
	}
	
    public HomePage sendMessage() {
		
		System.out.println("messagesent");
		
		return this;
	}

}
