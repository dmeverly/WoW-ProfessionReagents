package reagents;

public abstract class Reagent {
	private final String name;

	public Reagent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
