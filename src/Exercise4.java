import java.util.Scanner;
public class Exercise4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        int  n = 81;
        for(int i = 2;i < n ;i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
