import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        float a = Scanner.nextFloat();
        String inputSymbol = Scanner.next();
        float b = Scanner.nextFloat();
        String symbol = "+";
        String symbol2 = "-";
        String symbol3 = "/";
        String symbol4 = "*";

        if (inputSymbol.equals(symbol)) {
        System.out.println(a + b);
    }
        if(inputSymbol.equals(symbol2)) {
            System.out.println(a - b);
        }
        if(inputSymbol.equals(symbol3)) {
            System.out.println(a / b);
        }
        if(inputSymbol.equals(symbol4)) {
            System.out.println(a*b);
        }
        if (!inputSymbol.equals(symbol) && !inputSymbol.equals(symbol2) && !inputSymbol.equals(symbol3)  && !inputSymbol.equals(symbol4))
            System.out.println("Invalid Symbol");

    }
}
