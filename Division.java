public class Division implements Calculator {
    @Override
    public ComplexNumber calculate(ComplexNumber number1, ComplexNumber number2) {
        if (number2.getReal() == 0 && number2.getImaginary() == 0) {
            throw new IllegalArgumentException("Unfortunately, you can't divide by zero");
        }
        double real = (number1.getReal() * number2.getReal() + 
                      number1.getImaginary() * number2.getImaginary()) / 
                      (number2.getReal() * number2.getReal() + 
                      number2.getImaginary() * number2.getImaginary());
        double imaginary = (number1.getImaginary() * number2.getReal() - 
                           number1.getReal() * number2.getImaginary()) / 
                           (number2.getReal() * number2.getReal() + 
                           number2.getImaginary() * number2.getImaginary());
        return new ComplexNumber(real, imaginary);
    }
}
