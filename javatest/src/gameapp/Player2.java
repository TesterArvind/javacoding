package gameapp;

public class Player2 extends Player1 {
	private boolean armour;
	private int health;

	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.health=health;
		this.armour=armour;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void damageByGun1() {
		if(armour) {
			this.health-=20;
		}
		
		if(this.health<=0) this.health=0;
		
		System.out.println("Armour is on , health reduced by 20"+  this.health);
		
		if(!armour) {
			this.health-=20;
			if(this.health<=0) {
				this.health=0;
			}

			System.out.println("Got hit by gun1, health reduced by 20"+ this.health);
			if(this.health==0) {
				System.out.println("player is dead");	
			}
		}
		
	}

}
