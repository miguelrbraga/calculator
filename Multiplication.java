package adcalculator;

public class Multiplication extends TwoParametersOperation implements MathProcessingTwoParameters {
	
	@Override
	public String getKeyword() {
		return "multiply";
	}

	@Override
	public char getSymbol() {
		return '*';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		this.setLeftVal(leftVal);
		this.setRightVal(rightVal);
		
		double value = leftVal * rightVal;
		this.setResult(value);
		
		return this.getResult();
	}

}
