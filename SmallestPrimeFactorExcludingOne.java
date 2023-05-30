import java.util.Scanner;
public class SmallestPrimeFactorExcludingOne {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num = line.nextInt();
        line.close();
        for(int i = 3; i < num; i++) {
            if(num % i == 0) {
                for(int x = 3; x < i; x++) {
                    if(i % x == 0) {
                        flag = false;
                        break;
                    }
                    flag = true;
                }
                if(flag) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}