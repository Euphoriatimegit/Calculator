public class RomanCalculation implements Calculator {

    @Override
    public String addition(String a, String b) {
        int numberA = romanNumberOfArabNumber(a);
        int numberB = romanNumberOfArabNumber(b);
        int result = numberA + numberB;
        return arabNumberOfRomanNumber(result);

    }

    @Override
    public String subtraction(String a, String b) {
        int numberA = romanNumberOfArabNumber(a);
        int numberB = romanNumberOfArabNumber(b);
        int result = numberA - numberB;
        return arabNumberOfRomanNumber(result);
    }

    @Override
    public String multiplication(String a, String b) {
        int numberA = romanNumberOfArabNumber(a);
        int numberB = romanNumberOfArabNumber(b);
        int result = numberA * numberB;
        return arabNumberOfRomanNumber(result);
    }

    @Override
    public String division(String a, String b) {
        int numberA = romanNumberOfArabNumber(a);
        int numberB = romanNumberOfArabNumber(b);
        int result = numberA / numberB;
        return arabNumberOfRomanNumber(result);
    }

    private int romanNumberOfArabNumber(String s) {
        if ("I".equals(s)) {
            return 1;
        } else if ("II".equals(s)) {
            return 2;
        } else if ("III".equals(s)) {
            return 3;
        } else if ("IV".equals(s)) {
            return 4;
        } else if ("V".equals(s)) {
            return 5;
        } else if ("VI".equals(s)) {
            return 6;
        } else if ("VII".equals(s)) {
            return 7;
        } else if ("VIII".equals(s)) {
            return 8;
        } else if ("IX".equals(s)) {
            return 9;
        } else if ("X".equals(s)) {
            return 10;
        }
        throw new RuntimeException("not correct");
    }

    private String arabNumberOfRomanNumber(int number) {
        if (number == 1) {
            return "I";
        } else if (number == 2) {
            return "II";
        } else if (number == 3) {
            return "III";
        } else if (number == 4) {
            return "IV";
        } else if (number == 5) {
            return "V";
        } else if (number == 6) {
            return "VI";
        } else if (number == 7) {
            return "VII";
        } else if (number == 8) {
            return "VIII";
        } else if (number == 9) {
            return "IX";
        } else if (number == 10) {
            return "X";
        } else if (number > 10 && number < 40) {
            return "X" + arabNumberOfRomanNumber(number - 10);
        } else if (number >= 40 && number < 50) {
            return "XL" + arabNumberOfRomanNumber(number - 40);
        } else if (number >= 50 && number < 90) {
            return "L" + arabNumberOfRomanNumber(number - 50);
        } else if (number >= 90 && number < 100) {
            return "XC" + arabNumberOfRomanNumber(number - 90);
        } else if (number == 100) {
            return "C";
        }
        return "";
    }
}

