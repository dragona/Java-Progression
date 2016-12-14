
public class GeometricProgression extends Progression {

	protected static long start = 1;
	private long base = 2; /*default base*/

	public GeometricProgression() {
		super(start);

	}

	public GeometricProgression(long base) {
		super(start);
		this.base = base;

	}

	public GeometricProgression(long base, long start) {
		super(start);
		this.base = base;

	}

	// Advance
	protected void advance() {
		current = current * base;

	}

	public static void main(String[] args) {
		GeometricProgression prog;
		System.out.print("Geometric progression with default base: ");
		prog = new GeometricProgression();
		prog.printProgression(10);
		System.out.print("Geometric progression with base 3: ");
		prog = new GeometricProgression(3);
		prog.printProgression(10);

	}

}
