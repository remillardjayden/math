import java.util.Scanner;
public class SmallestPrimeFactor {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num = line.nextInt();
        line.close();
        System.out.println(num%(num-1));
    }
}