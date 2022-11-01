import java.util.ArrayList;
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> inputsUntilEnough = new ArrayList<>();
        do {
            input = scanner.nextLine();
            inputsUntilEnough.add(input);
        } while (!input.equals("Enough"));
    }
}
