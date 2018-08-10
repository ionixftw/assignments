import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[5];
        // fill the array
        for ( int n  = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt();
        }
        // find max
        int maxNumber = numbers[0];
        for ( int n = 1; n < numbers.length; n++ ) {
            if ( numbers[n] > maxNumber ) {
                maxNumber = numbers[n];
            }
        }
        // print max
        System.out.println(maxNumber);

    }
}