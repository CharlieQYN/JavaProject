package charactor1;

public class APHero extends Hero implements AP,Mortal{
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	public void die() {
		System.out.println("����APHero�����ǲ���ģ�");
	}
}
