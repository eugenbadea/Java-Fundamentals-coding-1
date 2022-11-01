import java.util.Scanner;
public class Exercisep143825 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        text1 = text1.substring(1,3);
        text2 = text2.substring(1,3);
        // Sa afisan concatenarea celor 2 texte ignorand primul caracter al fiecaruia
        //Exemplu : "Hello" , "There"-> "ellohere"
        System.out.println(text1+text2);
    }
}
