package j2se;

public class Armor extends Item{
	int ac;
	
	public static void main(String[] args) {
		Armor clothArmor = new Armor();
		Armor hauberk = new Armor();
		
		clothArmor.name = "²¼¼×";
		clothArmor.price = 500;
		clothArmor.ac = 15;
		
		hauberk.name = "Ëø×Ó¼×";
		hauberk.price = 500;
		hauberk.ac = 40;
		
	}
	
	
}
