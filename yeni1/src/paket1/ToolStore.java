package paket1;

public class ToolStore extends NormalLoc{

	public ToolStore(Player player) {
		super(player,"Mağaza");
	}
	@Override
	public boolean onLocation() {
		System.out.println(" ");
		System.out.println("---Mağazaya Hoşgeldiniz!---");
		boolean showMenu=true;
		while(showMenu) {
			System.out.println("1-Silahlar");
			System.out.println("2-Zırhlar");
			System.out.println("3-Çıkış Yap");
			System.out.print("Seçiminiz: ");
			//1 kere üretilir her nesne üretildiğinde üretilmez
			int selectCase=input.nextInt();
			while(selectCase<1||selectCase>3) {
				System.out.print("geçersiz değer,tekrar gir");
				selectCase=input.nextInt();
			}
			switch(selectCase) {
			case 1:
				printWeapon();
				buyWeapon();
				break;
			case 2:
				printArmor();
				buyArmor();
				break;
			case 3:
				System.out.println("bir daha bekleriz");
				showMenu =false;
				break;
			}
		}
		return true;
	}
	public void printWeapon() {
		System.out.println(" ");
		System.out.println("-----silahlar-----");
		System.out.println(" ");

		for(Weapon w:Weapon.weapons()) {
			System.out.println(w.getId()+w.getName()+" <Para:"+w.getPrice()+" <Hasar:"+w.getDamage());
		}
		System.out.println("0-Çıkış Yap ");
	}
	public void buyWeapon() {
		
		System.out.println("Bir silah seçiniz");
		int selectWeaponID = input.nextInt();
		while(selectWeaponID<0||selectWeaponID>Weapon.weapons().length) {
			System.out.print("geçersiz değer,tekrar gir");
			selectWeaponID=input.nextInt();
		}
		if(selectWeaponID!=0) {
			Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
			
			if(selectedWeapon !=null) {
				if(selectedWeapon.getPrice()>this.getPlayer().getMoney()) {
					System.out.println("Yeterli paranız bulunmamaktadır");
				}
				else {
					System.out.println(selectedWeapon.getName()+" silahını satın aldınız:)");
					int balance=this.getPlayer().getMoney()-selectedWeapon.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Kalan Bakiye: "+this.getPlayer().getMoney());
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
					//System.out.println("Yeni silahınız : "+this.getPlayer().getInventory().getWeapon().getName());
				}
			}
		}
		
	}
	public void printArmor() {
		System.out.println(" ");
		System.out.println("-----Zırhlar-----");
		System.out.println(" ");

		for(Armor a:Armor.armors()) {
			System.out.println(a.getId()+a.getName()+"-"+"<Para: "+a.getPrice()+",Zırh değeri: "+a.getBlock());
		}
	}
	public void buyArmor() {
		System.out.println("Bir zırh seçiniz");
		int selectArmorID = input.nextInt();
		while(selectArmorID<0||selectArmorID>Armor.armors().length) {
			System.out.print("geçersiz değer,tekrar gir");
			selectArmorID=input.nextInt();
		}
	if(selectArmorID !=0) {
	Armor selectedArmor = Armor.getArmorObjById(selectArmorID);
		
		if (selectedArmor!=null) {
			if(selectedArmor.getPrice()>this.getPlayer().getMoney()) {
				System.out.println("Yeterli paranız yok:(");
			}
			else {
				System.out.println(selectedArmor.getName()+" zırhını satın aldınız");
				this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedArmor.getPrice());
				this.getPlayer().getInventory().setArmor(selectedArmor);
				System.out.println("Kalan Bakiye: "+this.getPlayer().getMoney());

			}
		}
	}
	}
}
