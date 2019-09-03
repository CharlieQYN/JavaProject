package charactor1;

public class APHero extends Hero implements AP,Mortal{
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	
	public void die() {
		System.out.println("我是APHero，我是不朽的！");
	}
}
