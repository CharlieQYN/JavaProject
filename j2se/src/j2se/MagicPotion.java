package j2se;

public class MagicPotion extends Item{
	public void effect() {
		System.out.println("��ƿʹ�ú󣬿��Ի�ħ��");
	}
	
	
	public static void main(String[] args) {
		MagicPotion mp = new MagicPotion();
		mp.effect();
		
	}
}
