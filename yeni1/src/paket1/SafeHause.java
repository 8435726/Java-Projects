package paket1;

public class SafeHause extends NormalLoc {
	//constracter
	public SafeHause(Player player) {
		super(player,"Güvenli Ev");
	}
	
	@Override
	public boolean onLocation() {
		System.out.println("Güvenli evdesiniz");
		System.out.println("Canınız yenilendi");
		this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
		return true;
	}
}
