import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Please enter the quantity of numbers: ");
        int q = scanner.nextInt();
        // initialize and fill an array containing q items
        int[] numbers = new int[q];
        for ( int n = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt();
        }  
        // sort the array in ascending order
        for ( int n = 0; n < numbers.length - 1; n++ ) {
            // find min
            int minLocation = n;
            for ( int k = n + 1; k < numbers.length; k++) {
                if ( numbers[k] < numbers[minLocation]) {
                    minLocation = k;
                }
            }
            // swap min with current n
            int temp = numbers[n];
            numbers[n] = numbers[minLocation];
            numbers[minLocation] = temp;
        } 
        // find median
        double median = 0.0;
        if ( numbers.length % 2 == 1 ){
            // odd number of elements
            median = numbers[numbers.length / 2];
        } else {
            // even number of elements
            median = ( numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1] ) / 2.0;
        }
        System.out.println("Median " + median);
    }
}