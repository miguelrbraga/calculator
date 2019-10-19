package adcalculator;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) throws InvalidStatementException {
		
		Addition addition = new Addition();
		Subtraction subtraction = new Subtraction();
		Multiplication multiplication = new Multiplication();
		Division division = new Division();
		Exponentiation exponentiation = new Exponentiation();
		SquareRoot squareRoot = new SquareRoot();
		CubeRoot cubeRoot = new CubeRoot();
		
		MathProcessingOneParameter[] oneParameter = new MathProcessingOneParameter[] {
				squareRoot, cubeRoot
		};
		
		MathProcessingTwoParameters[] twoParameters = new MathProcessingTwoParameters[] {
				addition, subtraction, multiplication, division, exponentiation
		};
		
		DynamicHelper helper = new DynamicHelper(oneParameter, twoParameters);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter operation(s) to calculate in the format: ");
		System.out.println("[<operation> <first value> <second value>]");
		String statement;
		
		while (scanner.hasNextLine()) {
			
			statement = scanner.nextLine();
			String output = helper.process(statement);
			System.out.println(output);
			
		}
		scanner.close();
		
	}
}
