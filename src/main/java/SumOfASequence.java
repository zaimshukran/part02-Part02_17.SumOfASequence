
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for(int i = 1; i<=input; i++){
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
