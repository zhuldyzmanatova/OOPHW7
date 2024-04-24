import java.util.logging.Logger;

public class LoggingDecorator implements Calculator {
    
    private Calculator calculator;
    private String operationName;
    private Logger logger = Logger.getLogger(LoggingDecorator.class.getName());

    public LoggingDecorator(Calculator calculator, String operationName) {
        this.calculator = calculator;
        this.operationName = operationName;
    }

    public ComplexNumber calculate(ComplexNumber number1, ComplexNumber number2) {
        logger.info(operationName + " calculation: " + number1 + ", " + number2);
        ComplexNumber result = calculator.calculate(number1, number2);
        logger.info("Result for " + operationName + ": " + result);
        return result;
    }     
}