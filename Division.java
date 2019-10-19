package adcalculator;

public class Division extends TwoParametersOperation implements MathProcessingTwoParameters {
	
	@Override
	public String getKeyword() {
		return "divide";
	}

	@Override
	public char getSymbol() {
		return '/';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		this.setLeftVal(leftVal);
		this.setRightVal(rightVal);
		
		double value = leftVal / rightVal;
		this.setResult(value);
		
		return this.getResult();
	}

}
