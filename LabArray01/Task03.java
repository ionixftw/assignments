import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[10];
        for ( int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = scanner.nextInt();        
        }
        for ( int n = numbers.length - 1; n >= 0; n--) {
            System.out.println(numbers[n]);
        }
    }
}