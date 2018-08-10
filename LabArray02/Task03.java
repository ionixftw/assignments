import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[5];
        // take input from user and fill the array
        for ( int n = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt();        
        }
        // iterate and find max and min Location
        int maxLocation = 0;
        int minLocation = 0;
        for ( int n = 1; n < numbers.length; n++ ) {
            if ( numbers[n] > numbers[maxLocation] )
                maxLocation = n;
            if ( numbers[n] < numbers[minLocation] )
                minLocation = n;
        }
        // print found max and min and their locations
        System.out.println("Smallest number " + numbers[minLocation] + " was found at location " + minLocation);
        System.out.println("Largest number " + numbers[maxLocation] + " was found at location " + maxLocation);
    }
}