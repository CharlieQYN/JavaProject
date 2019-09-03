package j2se;

public class MagicPotion extends Item{
	public void effect() {
		System.out.println("蓝瓶使用后，可以回魔法");
	}
	
	
	public static void main(String[] args) {
		MagicPotion mp = new MagicPotion();
		mp.effect();
		
	}
}
