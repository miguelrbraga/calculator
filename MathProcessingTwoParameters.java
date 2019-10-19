package adcalculator;

public interface MathProcessingTwoParameters {
	
	String getKeyword();
	char getSymbol();
	double doCalculation(double leftVal, double rightVal);

}
