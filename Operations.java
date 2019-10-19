package adcalculator;

public enum Operations {
	
	ADDITION('+'), SUBTRACTION('-'), MULTIPLICATION('*'), DIVISION('/');
	
	private final char operationSymbol;
	
	private Operations(char operationSymbol) {
		this.operationSymbol = operationSymbol;
	}

	public char getOperationSymbol() {
		return operationSymbol;
	}

}
