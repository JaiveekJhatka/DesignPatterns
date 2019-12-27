package complete.strategies;

public class CSVPrintStrategy implements IPrintStrategy{
	
	@Override
	public <T> void print(T[] array) {
		int i;
		for(i=0; i<array.length-1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[i]);
	}
}
