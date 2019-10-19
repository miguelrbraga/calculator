package adcalculator;

public class Addition extends TwoParametersOperation implements MathProcessingTwoParameters {

	@Override
	public String getKeyword() {
		return "add";
	}

	@Override
	public char getSymbol() {
		return '+';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		this.setLeftVal(leftVal);
		this.setRightVal(rightVal);
		
		double value = this.getLeftVal() + this.getRightVal();
		this.setResult(value);
		
		return this.getResult();
	}
}
