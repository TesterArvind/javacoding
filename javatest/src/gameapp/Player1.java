package gameapp;

public class Player1 {

	private String name;
	private String weapon;
	private int health;

	public Player1(String name,String weapon,int health){
		this.name=name;
		this.weapon=weapon;
		this.health=health;	
	}

	public void damageByGun1() {
		this.health-=30;
		if(this.health<=0) {
			this.health=0;
		}

		System.out.println("Got hit by gun1, health reduced by 30"+ this.health);
		if(this.health==0) {
			System.out.println("player is dead");	
		}
	}

	public void damageByGun2() {
		this.health-=50;
		if(this.health<=0) {
			this.health=0;
		}

		System.out.println("Got hit by gun1, health reduced by 50"+ this.health);
		if(this.health==0) {
			System.out.println("player is dead");	
		}
	}


}
