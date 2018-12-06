package beans;

public class MacBookAir {
	private int			ram;
	private int			discSpace;
	private static int	counter;

	public MacBookAir(int ram, int discSpace) {
		super();
		this.ram = ram;
		this.discSpace = discSpace;

		counter++;
	}

	public int getRam() {
		return ram;
	}

	public int getDiscSpace() {
		return discSpace;
	}

	public int getCounter() {
		return counter;
	}

}
