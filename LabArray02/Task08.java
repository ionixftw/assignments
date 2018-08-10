import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        // initialize and assign array
        String[] numbers = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // ask user for an input
        System.out.println("Please enter a digit between 0-9:");
        int digit = scanner.nextInt();
        // print output from array
        System.out.println(numbers[digit]);      
    }
}