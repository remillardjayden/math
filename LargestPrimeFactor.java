import java.util.Scanner;
public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num = line.nextInt();
        while(num == 1) {
            System.out.println("You're stupid. 1 isn't prime or non-prime. Try again.");
            System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
            num = line.nextInt();
        }
        line.close();
        if(num > 0) {
            for(int i = 3; i < num; i+=2) {
                if(num%2 == 0) {
                    num /= 2;
                    i = 3;
                }
                if(num % i == 0) {
                    num /= i;
                    i = 3;
                }
            }
        } else if(num < 0) {
            for(int i = -3; i > num; i-=2) {
                if(num%2 == 0) {
                    num /= 2;
                    i = -3;
                }
                if(num % i == 0) {
                    num /= -i;
                    i = -3;
                }
            }
        } else { num = 0; }
        System.out.println(num);
    }
}