package charactor1;

import j2se.Item;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public Hero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed) {
		name = heroName;
		hp = heroHP;
		armor = heroArmor;
		moveSpeed = heroMoveSpeed;
		
	}
	
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public void kill(Mortal m) {
		m.die();
	}
	
	public static void battleWin() {
		System.out.println("hero battle win");
	}
	
	public void useItem(Item i) {
		System.out.println("hero use item");
		i.effect();
	}
	
	public String toString() {
		return name;
	}
	
	public void finalize() {
		System.out.println("这个英雄正在被回收");
	}
	
	public boolean equals(Object o) {
		if (o instanceof Hero) {
			Hero h = (Hero)o;
			return this.hp == h.hp;
			
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.hp = 300;
		Hero h2 = new Hero();
		h2.hp = 400;
		Hero h3 = new Hero();
		h3.hp = 300;
		
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
		System.out.println("----------------------------");
		
		System.out.println(h1 == h2);
		System.out.println(h1 == h3);
		
	}
}
