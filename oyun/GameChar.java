package paket1;

public abstract class GameChar {  //GameChar adında nesne üretilmesin
	private int id;
	private String name;
	private int damage;
	private int health;
	private int money;
	
	//contracterlar
	public GameChar(int id ,String name ,int damage, int health, int money) {
		this.id=id;
		this.name=name; 
		this.damage = damage;
		this.health = health;
		this.money = money;
	}
	//get set kısmı
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//get set bitti
	
	
	
}

