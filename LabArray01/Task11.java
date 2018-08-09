import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[10];
        for ( int n = 0; n < numbers.length; n++ ){
            if ( n == 0 ) {
                System.out.println("Please enter a number: ");
                numbers[n] = scanner.nextInt();
            } else {
                boolean found = true;
                int promptCount = 1;
                int nextNum = 0;
                while ( found ) {
                    if ( promptCount == 1)
                        System.out.println("Please enter a number: ");
                    else 
                        System.out.println("The number already exists. Please enter a new number :");
                    nextNum = scanner.nextInt();
                    for ( int c = 0; c <= n; c++ ) {
                        if ( numbers[c] == nextNum ) {
                            found = true;
                            break;
                        }
                        else { 
                            found = false;
                        }
                    }
                    promptCount++;
                }
                numbers[n] = nextNum;
            }
        }
        for ( int n = 0; n < numbers.length; n++ ) {
            System.out.println(numbers[n]);
        }        
    }
}