package j2se;

public class LifePotion extends Item{
	public void effect() {
		System.out.println("Ѫƿʹ�ú󣬿��Ի�Ѫ");
	}
	
	public static void main(String[] args) {
		Item i = new Item();
		i.effect();
		
		LifePotion lp = new LifePotion();
		lp.effect();
		
		
	}
}
