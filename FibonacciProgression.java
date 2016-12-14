/**
 * Implementation of Fibonacci
 * 
 * @author Feilong
 *
 */
public class FibonacciProgression extends Progression {
	private long previous = 0;
	private static long first = 1;

	public FibonacciProgression() {
		this(0, first);
	}

	public FibonacciProgression(long previous) {
		this(previous, first);
	}

	public FibonacciProgression(long first, long second) {
		super(first);
		this.previous = second - first;
	}

	protected void advance() {
		long temp = previous;
		previous = current;
		current = temp + current;

	}

	public static void main(String[] args) {
		FibonacciProgression prog;
		System.out.print("Fibonacci progression with default start values: ");
		prog = new FibonacciProgression();
		prog.printProgression(10);
		
		System.out.print("Fibonacci progression with default previous values 1: ");
		prog = new FibonacciProgression(1);
		prog.printProgression(10);
		
		
		System.out.print("Fibonacci progression with start values 4 and 6: ");
		prog = new FibonacciProgression(4, 6);
		prog.printProgression(10);
	}

}
