import java.util.Scanner;
public class Exercise3 {
    // Write a program solving a quadratic equation
    // This program should take three integers(coeficients of the quadratic equation a,b,c) and calculate the roots
    //x1,x2 of the equation ax2 + bx+c=0
    //If delta com out negative,print "Delta negative" and exit the program.
    // Formula you' ll need:
    //  delta = b2-4ac
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu valoarea coeficientului a");
        int a = scanner.nextInt();
        System.out.println("Introdu valoarea coeficientului b");
        int b = scanner.nextInt();
        System.out.println("Introdu valoarea coeficientului c");
        int c = scanner.nextInt();
    }


}
