package adcalculator;

public class SquareRoot extends OneParameterOperation implements MathProcessingOneParameter {

	@Override
	public String getKeyword() {
		return "sqrt";
	}

	@Override
	public char getSymbol() {
		return '\u221A';
	}

	@Override
	public double doCalculation(double parameter) {
		this.setParameter(parameter);
		
		double value = Math.sqrt(parameter);
		this.setResult(value);
		
		return this.getResult();
	}
	
}
