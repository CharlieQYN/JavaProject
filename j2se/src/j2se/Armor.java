package j2se;

public class Armor extends Item{
	int ac;
	
	public static void main(String[] args) {
		Armor clothArmor = new Armor();
		Armor hauberk = new Armor();
		
		clothArmor.name = "����";
		clothArmor.price = 500;
		clothArmor.ac = 15;
		
		hauberk.name = "���Ӽ�";
		hauberk.price = 500;
		hauberk.ac = 40;
		
	}
	
	
}
