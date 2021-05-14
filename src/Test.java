
public class Test {

    private Console console = new Console();

    public static void main(String[] args) {
        new Test().start();
    }

    private void start() {

        try {
            String inputText = console.getInputText();

            String[] split = inputText.split("\\+|\\-|\\*|\\/");
            if (split.length != 2) {
                console.printConsole("not correct");
                System.exit(0);
            }

            String value1 = split[0];
            String value2 = split[1];

            Calculator calculator;
            if (valueCheck(value1, value2)) {
                calculator = new ArabCalculation();
            } else {
                calculator = new RomanCalculation();
            }

            String result = operation(calculator, inputText, value1, value2);
            console.printConsole(result);
        } catch (RuntimeException e) {
            console.printConsole(e.getMessage());
        }

    }

    private boolean valueCheck(String v1, String v2) {
        try {
            Integer.parseInt(v1);
            Integer.parseInt(v2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private String operation(Calculator calculator,String inputText,String value1,String value2){

        String result ="";
        if(inputText.contains("+")){
            result = calculator.addition(value1,value2);
        }else if(inputText.contains("-")){
            result = calculator.subtraction(value1,value2);
        }else if(inputText.contains("*")){
            result = calculator.multiplication(value1,value2);
        }else if (inputText.contains("/")){
            result = calculator.division(value1,value2);
        }else{
            console.printConsole("not correct");
            System.exit(0);
        }
        return result;
    }
}
