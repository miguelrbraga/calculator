package adcalculator;

public class DynamicHelper {
	
	public static final String SEPARATOR = " ";
	
	private MathProcessingOneParameter[] handlers1;
	private MathProcessingTwoParameters[] handlers2;

	public DynamicHelper(MathProcessingOneParameter[] handlers) {
		this.handlers1 = handlers;
	}
	
	public DynamicHelper(MathProcessingTwoParameters[] handlers) {
		this.handlers2 = handlers;
	}
	
	public DynamicHelper(MathProcessingOneParameter[] handlers1, MathProcessingTwoParameters[] handlers2) {
		this.handlers1 = handlers1;
		this.handlers2 = handlers2;
	}
	
	public String process(String statement) throws InvalidStatementException {
		
		String parts[] = statement.split(SEPARATOR);
		String keyword = parts[0];
		
		MathProcessingOneParameter theHandler1 = null;
		MathProcessingTwoParameters theHandler2 = null;
		
		for (MathProcessingOneParameter handler: handlers1) {
			if (keyword.equalsIgnoreCase(handler.getKeyword())) {
				theHandler1 = handler;
				break;
			}
		}
		
		for (MathProcessingTwoParameters handler: handlers2) {
			if (keyword.equalsIgnoreCase(handler.getKeyword())) {
				theHandler2 = handler;
				break;
			}
		}
		
		if (theHandler1 == null && theHandler2 == null) {
			throw new InvalidStatementException("Invalid command", statement);
		} else if (theHandler1 != null && parts.length != 2) {
			throw new InvalidStatementException("Incorrect number of fields, expected 2", statement);
		} else if (theHandler2 != null && parts.length != 3) {
			throw new InvalidStatementException("Incorrect number of fields, expected 3", statement);
		}
		
		String resultReturn = "";
		
		if (theHandler1 != null) {
			
			double parameter;
			
			try {
				parameter = Double.parseDouble(parts[1]);
			} catch (NumberFormatException e) {
				throw new InvalidStatementException("Non-numeric data", statement, e);
			}
			
			double result = theHandler1.doCalculation(parameter);
			
			StringBuilder sb = new StringBuilder(40);
			sb.append(theHandler1.getSymbol());
			sb.append(' ');
			sb.append(parameter);
			sb.append(" = ");
			sb.append(result);
			
			resultReturn = sb.toString();
		}
		
		else if (theHandler2 != null) {
			
			double leftVal;
			double rightVal;
			
			try {
				leftVal = Double.parseDouble(parts[1]);
				rightVal = Double.parseDouble(parts[2]);
			} catch (NumberFormatException e) {
				throw new InvalidStatementException("Non-numeric data", statement, e);
			}
			
			if (theHandler2.getSymbol() == Operations.DIVISION.getOperationSymbol()
					&& rightVal == 0) {
				throw new InvalidStatementException("Division by 0 is invalid", statement);
			}
			
			double result = theHandler2.doCalculation(leftVal, rightVal);
			
			StringBuilder sb = new StringBuilder(40);
			sb.append(leftVal);
			sb.append(' ');
			sb.append(theHandler2.getSymbol());
			sb.append(' ');
			sb.append(rightVal);
			sb.append(" = ");
			sb.append(result);
			
			resultReturn = sb.toString();	
			
		}
		
		return resultReturn;
	}
}
