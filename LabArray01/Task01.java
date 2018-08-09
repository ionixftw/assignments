import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[3];
        int sum = 0;
        for (int n = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt();
            sum += numbers[n];
        }
        System.out.print(sum + ", ");
        for(int n = 0; n < numbers.length; n++) {
            if ( n != numbers.length - 1)
                System.out.print(numbers[n] + ", ");
            else
                System.out.print(numbers[n]);
        }
        System.out.println();
    }
}