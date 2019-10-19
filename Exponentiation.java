package adcalculator;

public class Exponentiation extends TwoParametersOperation implements MathProcessingTwoParameters {
	
	@Override
	public String getKeyword() {
		return "power";
	}

	@Override
	public char getSymbol() {
		return '^';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		this.setLeftVal(leftVal);
		this.setRightVal(rightVal);
		
		double value = Math.pow(leftVal, rightVal);
		this.setResult(value);
		
		return this.getResult();
	}

}
