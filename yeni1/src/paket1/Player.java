package paket1;

import java.util.Scanner;

public class Player {
	private int damage;
	private int health;
	private int orjinalHealth;
	private int money;
	private String name;    //oyuncunun ismi
	private String charName;  //oyundaki oyuncunun karakter ismi
	private Scanner input = new Scanner(System.in);//Scannerı sınıfa ait tanımladık
	private Inventory inventory;
	
	public Player(String name) {
		this.name=name; 
		this.inventory=new Inventory();
	} 
	
	/*public void selectChar() {
		samurai samurai=new samurai();
		Knight knight=new Knight();
		Archer archer=new Archer();
	}
	*/
	// Karakter seçmek için
	public void selectChar() {
		// polimorfizm
		GameChar[] charList= {new samurai(),new Knight(),new Archer(),new Testkarakter()};
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Karakterler:");
		System.out.println("-------------------------------------------------------------------");
		for(GameChar gameChar : charList) {
			System.out.println("ID:"+gameChar.getId()+"\t Karakter:"+gameChar.getName()+"\t\t Hasar:"+gameChar.getDamage() +"\t\t Sağlık:"+gameChar.getHealth()+"\t\t Para:"+gameChar.getMoney());

		}	
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Lütfen bir karakter gir:");
		int selectChar=input.nextInt(); 
		switch (selectChar) {
		case 1:
			initPlayer(new samurai());
			break;
		case 2:
			initPlayer(new Knight());
			break;
		case 3:
			initPlayer(new Archer());
			break;	
		case 4:
			initPlayer(new Testkarakter());
			break;
		default:
			initPlayer(new samurai());
//kullanıcı yanlış girerse varsayılan samuray olsun 
		}
		System.out.println("Karakter:"+this.getCharName()+
				",Hasar:"+this.getDamage()+
				",Sağlık:"+this.getHealth()+
				",Para:"+this.getMoney());//direk money yazınca da oluyo ama galiba oyuncu karaktere büründü böyle
	}
	
	public void initPlayer(GameChar gameChar) {
		this.setDamage(gameChar.getDamage());
		this.setHealth(gameChar.getHealth());
		this.setOrjinalHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
		this.setCharName(gameChar.getName());
	}
	public void printInfo() {
		System.out.println(
				"Silah :"+this.getInventory().getWeapon().getName()+
				",Zırh :"+this.getInventory().getArmor().getName()+
				",Bloklama :"+this.getInventory().getArmor().getBlock()+
				",Hasar :"+this.getTotalDamage()+
				",Sağlık :"+this.getHealth()+
				",Para :"+this.getMoney());
	}
	//get set kısmı
	public int getTotalDamage() {
		return  damage +this.getInventory().getWeapon().getDamage();
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage=damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health=health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public String  getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName=charName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getOrjinalHealth() {
		return orjinalHealth;
	}

	public void setOrjinalHealth(int orjinalHealth) {
		this.orjinalHealth = orjinalHealth;
	}
	
	//get set kısmı bitti

	
} 
