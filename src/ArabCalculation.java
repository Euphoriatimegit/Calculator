public class ArabCalculation implements Calculator {

    Console console = new Console();

    @Override
    public String addition(String a, String b) {
        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);
        inputCorrect(numberA,numberB);
        int result = numberA + numberB;
        return String.valueOf(result);
    }

    @Override
    public String subtraction(String a, String b) {
        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);
        inputCorrect(numberA,numberB);
        int result = numberA - numberB;
        return String.valueOf(result);
    }

    @Override
    public String multiplication(String a, String b) {
        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);
        inputCorrect(numberA,numberB);
        int result = numberA * numberB;
        return String.valueOf(result);
    }

    @Override
    public String division(String a, String b) {
        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);
        inputCorrect(numberA,numberB);
        int result = numberA / numberB;
        return String.valueOf(result);
    }

    private void inputCorrect(int a, int b) {
        if (a > 0 && a <= 10 && b > 0 && b <= 10) {

        } else {
            console.printConsole("not correct");
            System.exit(0);
        }

    }
}
