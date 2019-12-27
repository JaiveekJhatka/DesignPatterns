package complete;

import complete.strategies.CSVPrintStrategy;
import complete.strategies.SingleElemPerLinePrintStrategy;

public class Client {
	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5, 6};
		ArrayPrinter csv = new ArrayPrinter(new CSVPrintStrategy());
		ArrayPrinter sepl = new ArrayPrinter(new SingleElemPerLinePrintStrategy());
		csv.print(array);
		sepl.print(array);
	}
}
