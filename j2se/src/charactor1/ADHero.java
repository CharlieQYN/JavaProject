package charactor1;

public class ADHero extends Hero implements AD,Mortal{
	public void physicAttack() {
		System.out.println("����������");
	}
	
	public void die() {
		System.out.println("����ADHero�����ǲ���ģ�");
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
