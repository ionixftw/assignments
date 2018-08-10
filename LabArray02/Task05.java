import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        //initialize and fill array
        int[] numbers = new int[5];
        for ( int n = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt();
        }         
        // find max, swap, and sort array
        for ( int n = 0; n < numbers.length - 1; n++ ) {
            // find max
            int maxLocation = n;
            for ( int z = n + 1; z < numbers.length; z++ ) {
                if (numbers[z] > numbers[maxLocation]) {
                    maxLocation = z;
                }
            }
            //swap with the max for each n
            int temp = numbers[n];
            numbers[n] = numbers[maxLocation];
            numbers[maxLocation] = temp;
        }

        // print out the sorted array
        for ( int a = 0; a < numbers.length; a++ ) {
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
    }
}