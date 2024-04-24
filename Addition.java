public class Addition implements Calculator {
    @Override
    public ComplexNumber calculate(ComplexNumber number1, ComplexNumber number2) {
        double real = number1.getReal() + number2.getReal();
        double imaginary = number1.getImaginary() + number2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }
}
