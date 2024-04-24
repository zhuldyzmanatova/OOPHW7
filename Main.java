public class Main {

    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 4);

        Calculator calculator1 = CalculatorFactory.createCalculator("add");
        Calculator loggingDecorator1 = new LoggingDecorator(calculator1, "Addition");
        ComplexNumber resultForAdd = loggingDecorator1.calculate(number1, number2);
        System.out.println("-----------------------------------------");

        Calculator calculator2 = CalculatorFactory.createCalculator("multiply");
        Calculator loggingDecorator2 = new LoggingDecorator(calculator2, "Multiplication");
        ComplexNumber resultForMultiply = loggingDecorator2.calculate(number1, number2);
        System.out.println("-----------------------------------------");

        Calculator calculator3 = CalculatorFactory.createCalculator("divide");
        Calculator loggingDecorator3 = new LoggingDecorator(calculator3, "Division");
        ComplexNumber resultForDivide = loggingDecorator3.calculate(number1, number2);
        System.out.println("-----------------------------------------");

        Subtraction subtraction = new Subtraction();

        Calculator calculator4 = new SubtractionAdapter(subtraction);
        Calculator loggingDecorator4 = new LoggingDecorator(calculator4, "Subtraction");
        ComplexNumber resultForSubtract = loggingDecorator4.calculate(number1, number2);
        System.out.println("-----------------------------------------");

    }
}
