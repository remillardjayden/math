import java.util.Scanner;
public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num = line.nextInt();
        line.close();
        for(int i = 3; i < num; i+=2) {
            if(num % i == 0) {
                num /= i;
                i = 3;
            }
        }
        System.out.println(num);
    }
}