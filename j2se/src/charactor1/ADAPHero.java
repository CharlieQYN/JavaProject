package charactor1;

public class ADAPHero extends Hero implements AD, AP,Mortal{
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	
	public void die() {
		System.out.println("我是ADAPHero，我是不朽的！");
	}
}
