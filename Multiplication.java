public class Multiplication implements Calculator {
    
    @Override
    public ComplexNumber calculate(ComplexNumber number1, ComplexNumber number2) {
        double real = number1.getReal() * number2.getReal() - 
                      number1.getImaginary() * number2.getImaginary();
        double imaginary = number1.getReal() * number2.getImaginary() + 
                           number1.getImaginary() * number2.getReal();
        return new ComplexNumber(real, imaginary);
    }
}