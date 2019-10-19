package adcalculator;

public class CubeRoot extends OneParameterOperation implements MathProcessingOneParameter {

	@Override
	public String getKeyword() {
		return "cbrt";
	}

	@Override
	public char getSymbol() {
		return '\u221B';
	}

	@Override
	public double doCalculation(double parameter) {
		this.setParameter(parameter);
		
		double value = Math.cbrt(parameter);
		this.setResult(value);
		
		return this.getResult();
	}

}
