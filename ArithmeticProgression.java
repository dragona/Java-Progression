/**
 * ArithmeticProgression
 * 
 * @author Feilong
 *
 */
public class ArithmeticProgression extends Progression {
	protected long increment;

	public ArithmeticProgression() {
		this(1, 0); 

	}

	public ArithmeticProgression(long stepSize) {
		this(stepSize, 0);
	}

	public ArithmeticProgression(long stepSize, long start) {
		super(start);
		increment = stepSize;
	}

	protected void advance() {
		current += increment;
	}

	public static void main(String[] args) {
		ArithmeticProgression prog;
		System.out.print ("Arithmetic progression with default increment: ");
		prog = new ArithmeticProgression();
		prog.printProgression(10);

		System.out.print("Arithmetic progression with increment 5: ");
		prog = new ArithmeticProgression(5);
		prog.printProgression(10);

		System.out.print("Arithmetic progresson with start 2: ");
		prog = new ArithmeticProgression(5, 2);
		prog.printProgression(10);
	}
}
