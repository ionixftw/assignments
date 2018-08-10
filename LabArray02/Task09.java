import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        // initialize and fill array with user input
        int[] numbers = new int[15];
        int[] numbersCount = new int[10];
        for ( int n = 0; n < numbers.length; n++) {
            // check for illegal input
            boolean legal = false;
            int digit = 0;
            while ( !legal ) {
                System.out.println("Please enter a digit between 0-9: ");
                digit = scanner.nextInt();
                if ( digit >=0 && digit <=9 ) {
                    legal = true;
                }
            }
            numbers[n] = digit;
            numbersCount[digit]++;
        }
        // print digit count
        for ( int n = 0; n < numbersCount.length; n++ ){
            System.out.println(n + " count: " + numbersCount[n] + " time(s). ");
        }        
    }
}