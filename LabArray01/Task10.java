import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[10];
        for ( int n = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt();
            for ( int c = 0; c <= n; c++ ) {
                if (c != n)
                    System.out.print(numbers[c] + " ");
                else 
                    System.out.print(numbers[c]);
            }
            System.out.println();        
        }
    }
}