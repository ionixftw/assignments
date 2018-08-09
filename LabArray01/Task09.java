import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[10];
        for ( int n = 0; n < numbers.length; n++ ) {
            System.out.println("Please enter a numeber: ");
            numbers[n] = scanner.nextInt();        
        }
        System.out.println("Please enter the number to search in the array: ");
        int searchItem = scanner.nextInt();
        boolean found = false;
        for ( int n = 0; n < numbers.length; n++ ) {
            if ( numbers[n] == searchItem ) {
                found = true;
            }
        }
        if (found)
            System.out.println("yes");
        else 
            System.out.println("no");
    }
}