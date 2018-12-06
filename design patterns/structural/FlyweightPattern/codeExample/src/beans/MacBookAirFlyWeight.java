package beans;

public class MacBookAirFlyWeight implements MacBook {
	private String		id;
	private MacBookAir	macBookAir;

	public MacBookAirFlyWeight(String id, MacBookAir macBookAir) {
		super();
		this.id = id;
		this.macBookAir = macBookAir;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public int getRam() {
		return macBookAir.getRam();
	}

	@Override
	public int getDiscCapacity() {
		return macBookAir.getDiscSpace();
	}

}
