package complete;

import complete.strategies.IPrintStrategy;

public class ArrayPrinter {
	private IPrintStrategy printStrategy;
	
	public ArrayPrinter(IPrintStrategy printStrategy) {
		this.printStrategy = printStrategy;
	}
	
	public <T> void print(T[] array) {
		printStrategy.print(array);
	}
}
