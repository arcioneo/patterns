package templates;

public abstract class HouseTemplate {

	public void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}

	public abstract void buildWalls();

	public abstract void buildPillars();

}
