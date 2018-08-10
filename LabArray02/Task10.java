import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        // practice printf with known types
        String text = "Hello, my dear friend. Welcome to the jungle! I'll be your guide.";
        System.out.printf("%14.22s%n", text);
        double dblTotal = 123456789.234567899;
        double dblTotal2 = 45678789.4567899;
        double dblTotal3 = 8910.234567899;
        double dblSum = dblTotal + dblTotal2 + dblTotal3;
        System.out.printf("%,15.3f%n",dblTotal);
        System.out.printf("%,15.3f%n", dblTotal2);
        System.out.printf("%,15.3f%n", dblTotal3);
        System.out.printf("+ -------------%n");
        System.out.printf("%,15.3f%n", dblSum);
        int inTotal = 1234567;
        int inTotal2 = 23456;
        int inTotal3 = 24425245;
        int inSum = inTotal + inTotal2 + inTotal3;
        System.out.printf("%014d%n",inTotal);      
        System.out.printf("%014d%n",inTotal2);
        System.out.printf("%014d%n",inTotal3);
        System.out.printf("+ ------------%n");
        System.out.printf("%14d%n",inSum);  
        // Task Work
        double z;
        z = 5 + Math.sin(80*Math.PI/180);
        System.out.printf("%-6.4f%n", z);

    }
}