import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        // initialize and fill an array containing 10 elements
        int[] numbers = new int[10];
        for ( int n = 0; n < numbers.length; n++ ){
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt(); 
        }
        // sort in ascending order
        for ( int i = 0; i < numbers.length - 1; i++ ) {
            // find min
            int minLocation = i;
            for ( int j = i + 1; j < numbers.length; j++ ) {
                if ( numbers[j] < numbers[minLocation]) {
                    minLocation = j;
                }
            }
            // swap min with current i
            int temp = numbers[i];
            numbers[i] = numbers[minLocation];
            numbers[minLocation] = temp;
        }
        //print out the array according to the first element
        // if the first element is odd print odd numbers first
        // if the first element is even print even numbers first
        if ( numbers[0] % 2 == 1 ) {
            // print odd numbers from array
            for (int n = 0; n < numbers.length; n++ ) {
                if ( numbers[n] % 2 == 1 )
                    System.out.print(numbers[n] + ", ");
            }         
            // print even numbers from array
            for (int n = 0; n < numbers.length; n++ ) {
                if ( numbers[n] % 2 == 0 ){
                    if ( n != numbers.length - 1 )
                        System.out.print(numbers[n] + ", ");
                    else 
                        System.out.print(numbers[n]);
                }      
            }
            System.out.println();
        } else {
            // print even numbers from array
            for (int n = 0; n < numbers.length; n++ ) {
                if ( numbers[n] % 2 == 0 ){
                        System.out.print(numbers[n] + ", ");
                    
                }      
            }
            // print odd numbers from array
            for (int n = 0; n < numbers.length; n++ ) {
                if ( numbers[n] % 2 == 1 )
                    if ( n != numbers.length - 1 )
                        System.out.print(numbers[n] + ", ");
                    else 
                        System.out.print(numbers[n]);
            }
            System.out.println();
        }
    }
}