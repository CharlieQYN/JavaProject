package charactor1;

public class ADAPHero extends Hero implements AD, AP,Mortal{
	public void physicAttack() {
		System.out.println("����������");
	}
	
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	public void die() {
		System.out.println("����ADAPHero�����ǲ���ģ�");
	}
}
