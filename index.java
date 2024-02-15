public class index {
    public static void main(String[] args) {

    }
    public int absoluteValue(int num1, int num2) {
        int total = 0;
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
        return total;
    }
    public int mulitply(int num1, int num2) {
        int total = 0;
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
        return total;
    }
    public float divide(float num1, float num2) {
        if(num1 > 0) {
            if(num2 > 0) {
                for(float i = 0; i < num1; i+=0.000001) {
                    if(i*num2>=num1) {
                        return i;
                    }
                }
            } else {
                for(float i = 0; i > -num1; i-=0.000001) {
                    if(i*num2>=num1) {
                        return i;
                    }
                }
            }
        } else if(num1 < 0){
            if(num2 > 0) {
                for(float i = 0; i > num1; i-=0.000001) {
                    if(i*num2<=num1) {
                        return i;
                    }
                }
            } else {
                for(float i = 0; i < -num1; i+=0.000001) {
                    if(i*num2<=num1) {
                        return i;
                    }
                }
            }
        }
        return num1;
    }
    public int smallestPrimeFactor(int num) {
        return num%(num-1);
    }
}