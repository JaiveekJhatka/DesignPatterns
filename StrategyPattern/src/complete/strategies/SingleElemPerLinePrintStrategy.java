package complete.strategies;

public class SingleElemPerLinePrintStrategy implements IPrintStrategy{

	@Override
	public <T> void print(T[] array) {
		for(T t : array) {
			System.out.println(t);
		}
	}
	
}
