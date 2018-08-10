import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[5];
        // take input and fill the array
        for ( int n = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a number: " );
            numbers[n] = scanner.nextInt();
        }
        for ( int i = 0; i < numbers.length - 1; i++ ){
            int minLocation = i;
            for ( int n = i + 1; n < numbers.length; n++ ){
                // find min
                if ( numbers[n] < numbers[minLocation])  {
                    minLocation = n;
                }
            }
            // swap min with current position
                int temp = numbers[i];
                numbers[i] = numbers[minLocation];
                numbers[minLocation] = temp;
        }
        // print out sorted array
        for ( int n = 0; n < numbers.length; n++) {
            System.out.print(numbers[n] + " ");        
        }
        System.out.println();
    }
}