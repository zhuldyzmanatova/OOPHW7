public class SubtractionAdapter implements Calculator {

    private Subtraction subtraction;

    public SubtractionAdapter(Subtraction subtraction) {
        this.subtraction = subtraction;
    }

    @Override
    public ComplexNumber calculate(ComplexNumber number1, ComplexNumber number2) {
        return subtraction.subtract(number1, number2);
    }
}

