import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num1 = line.nextInt();
        System.out.println("Input a second number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        int num2 = line.nextInt();
        while(num2 == 0) {
            System.out.println("ERROR: NUMBERS CANNOT BE DIVIDED BY ZERO (0)");
            System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
            num2 = line.nextInt();
        }
        line.close();
        System.out.print(num1 + "/" + num2 + " = ");
        if(num1 > 0) {
            if(num2 > 0) {
                for(int i = 0; i < num1; i++) {
                    if(i*num2>=num1) {
                        System.out.println(i);
                        break;
                    }
                }
            } else {
                for(int i = 0; i > -num1; i--) {
                    if(i*num2>=num1) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        } else {
            if(num2 > 0) {
                for(int i = 0; i > num1; i--) {
                    if(i*num2<=num1) {
                        System.out.println(i);
                        break;
                    }
                }
            } else {
                for(int i = 0; i < -num1; i++) {
                    if(i*num2<=num1) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
