import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num1 = line.nextInt();
        System.out.println("Input a second number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num2 = line.nextInt();
        line.close();
        int total = 0;
        System.out.print("|" + num1 + " * " + num2 + "| = ");
        if(num2 > 0) {
            for(int i = 0; i < num2; i++) {
                total += num1;
            }
        }
        else if(num2 < 0) {
            for(int i = 0; i > num2; i--) {
                total -= num1;
            }
        }
        if(total < 0) {
            total *= -1;
        }
        System.out.println(total);
    }
}