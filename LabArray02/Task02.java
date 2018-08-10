import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        // initialize and fill an array
        int[] numbers = new int[5];
        for ( int n = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt();        
        }
        // find max and max number location
        int maxNumber = numbers[0];
        int maxLocation = 0;
        for ( int n = 1; n < numbers.length; n++ ) {
            if ( numbers[n] > maxNumber) {
                maxNumber = numbers[n];
                maxLocation = n;
            }
        }
        // print max and max location
        System.out.println("Largest number " + maxNumber + " was found at location " + maxLocation);
    }
}