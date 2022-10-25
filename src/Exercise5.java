import java .util.Scanner;
public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for(int i = 0;i <= n ; i++) {
            sum = sum + 1/i;
        }
        System.out.println(sum);



    }
}
