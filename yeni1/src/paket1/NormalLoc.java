package paket1;

public abstract class NormalLoc extends Location {

	//contracter
	public NormalLoc(Player player,String name) {
		super(player,name);
	}
	@Override
	public boolean onLocation() {
		return true;
	}
}
