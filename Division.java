import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        float num1 = line.nextFloat();
        System.out.println("Input a second number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
        float num2 = line.nextFloat();
        while(num2 == 0) {
            System.out.println("ERROR: NUMBERS CANNOT BE DIVIDED BY ZERO (0)");
            System.out.println("Input a number less than " + Integer.MAX_VALUE + " and greater than " + Integer.MIN_VALUE + ":");
            num2 = line.nextFloat();
        }
        line.close();
        System.out.print(num1 + "/" + num2 + " = ");
        if(num1 > 0) {
            if(num2 > 0) {
                for(float i = 0; i < num1; i+=0.000001) {
                    if(i*num2>=num1) {
                        System.out.println(i);
                        break;
                    }
                }
            } else {
                for(float i = 0; i > -num1; i-=0.000001) {
                    if(i*num2>=num1) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        } else {
            if(num2 > 0) {
                for(float i = 0; i > num1; i-=0.000001) {
                    if(i*num2<=num1) {
                        System.out.println(i);
                        break;
                    }
                }
            } else {
                for(float i = 0; i < -num1; i+=0.000001) {
                    if(i*num2<=num1) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
