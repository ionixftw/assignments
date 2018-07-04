import java.util.*;

public class Task4 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter the taxpayer's age: ");
	int age = scanner.nextInt();

	System.out.println("Please enter the taxpayer's salary: ");
	double salary = scanner.nextDouble();

	double tax;
	if(age < 18) tax = 0.0;
	else if (salary < 10000) tax = 0.0;
	else if (salary < 20001) tax = salary * 0.05;
	else tax = salary * 0.10;
	System.out.println("The taxpayer's tax is: " + tax);
    }
}
