import java.util.ArrayList;
import java.util.Scanner;
public class AllFactors {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num = line.nextInt();
        line.close();
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                factors.add(i);
            }
        }
        System.out.print("[");
        for(int x = 0; x < factors.size()-1; x++) {
            System.out.print(factors.get(x) + ", ");
        }
        System.out.println(factors.get(factors.size()-1) + "]");
    }
}