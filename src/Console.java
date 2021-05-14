import java.util.Scanner;

public class Console {

    public String getInputText() {
        printConsole("Введите значение (пример: 2*2)");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        inputText = inputText.replaceAll(" ", "");
        return inputText;
    }

    public void printConsole(String text) {
        System.out.println(text);
    }
}
