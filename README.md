# calculator

Calculator that allows to perform the following arithmetic operations: addition, subtraction, multiplication, division, exponentiation, square root and cube root.

Classes explained: 

Addition, Subtraction, Multiplication, Division and Exponentiation all extend the abstract class TwoParametersOperation and all implement the MathProcessingTwoParameters interface.

SquareRoot and CubeRoot both extend the abstract class OneParametersOperation and both implement MathProcessingOneParameter interface.

The Calculate class is the main, whereas Operations is an Enum and InvalidStatementException is a custom exception.

Finally, DynamicHelper is the class which establishes the relationship between the user's input and the classes.
