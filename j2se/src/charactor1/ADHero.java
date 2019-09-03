package charactor1;

public class ADHero extends Hero implements AD,Mortal{
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
	public void die() {
		System.out.println("我是ADHero，我是不朽的！");
	}
	
	public static void battleWin() {
		System.out.println("ad hero battle win");
	}
	
	public ADHero() {
		
	}
	
	public static void main(String[] args) {
		Hero.battleWin();
		ADHero.battleWin();
	}
}
