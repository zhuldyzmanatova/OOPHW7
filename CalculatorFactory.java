public class CalculatorFactory {

    public static Calculator createCalculator (String operation){
        if (operation.equals("add")){
            return new Addition();
        } else if (operation.equals("multiply")) {
            return new Multiplication();
        } else if (operation.equals("divide")) {
            return new Division();
        }
        return null;
    }
}

