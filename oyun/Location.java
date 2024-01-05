package paket1;
import java.util.Scanner;

public abstract class Location {
	private Player player;
	protected String name;
	public static Scanner input = new Scanner(System.in);
	//constracter
	
	public Location(Player player,String name) {
		super();
		this.player = player;
		this.name = name;

		}
	public abstract boolean onLocation();
	
//get set başladı
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// get set bitti
	
}
