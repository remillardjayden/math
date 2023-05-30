import java.util.ArrayList;
import java.util.Scanner;
public class AllPrimeFactors {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num = line.nextInt();
        line.close();
        boolean flag = true;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i <= num; i++) {
            if(num % i == 0) {
                for(long x = 2L; x < i; x++) {
                    if(i%x==0) {
                        flag = false;
                    }
                }
                if(flag) {
                    primes.add(i);
                } else {
                    flag = true;
                }
            }
        }
        System.out.print("[");
        for(int i = 0; i < primes.size(); i++) {
            if(i != primes.size()-1) {
                System.out.print(primes.get(i) + ", ");
            } else {
                System.out.print(primes.get(i));
            }
        }
        System.out.println("]");
    }
}