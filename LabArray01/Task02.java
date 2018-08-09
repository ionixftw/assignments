import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] numbers = new int[10];
        for ( int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number:");
            numbers[i] = scanner.nextInt();        
        }
        System.out.println("Please enter an index between 0-9:");
        int index = scanner.nextInt();
        System.out.println(numbers[index]);
    }
}