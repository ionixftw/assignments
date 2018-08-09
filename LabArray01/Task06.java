import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[10];
        for ( int n = 0; n < numbers.length; n++ ) {  
            System.out.println("Please enter a number: ");
            numbers[n] = scanner.nextInt();        
        }
        for ( int n = numbers.length - 1; n >= 0; n-- ) {
            if ( numbers[n] % 2 == 1) {
                System.out.println(numbers[n]);
                break;
            }
        }
    }
}