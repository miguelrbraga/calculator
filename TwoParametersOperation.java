package adcalculator;

public abstract class TwoParametersOperation {
	
	private double leftVal;
	private double rightVal;
	private double result;
	
	public double getLeftVal() {
		return leftVal;
	}
	public double getRightVal() {
		return rightVal;
	}
	public double getResult() {
		return result;
	}
	protected void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}
	protected void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}
	protected void setResult(double result) {
		this.result = result;
	}	

}
