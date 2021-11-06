package u5pp;

/**
 * @author - Jacob Cho
 * This class is able to do more complex math functions than just simple math. It is able to take the absolute value of both 
 * integers and doubles, and it is able to raise any number to an exponent. It is also able to find the perfect square root of any 
 * number, and if that number does not have a perfect square root, then the method will return as -1.
 */
public class MyMath{
    //Returns the absolute value of any integer
    /**
     * 
     * @param x - the number that the method is going to return the absolute value of
     * @return - the absolute value of x as an int
     */
    public static int abs(int x){
        if(x < 0){
            x = x * -1;
        } else if (x == 0){
            x = 0;
        } 

        return x;
    }

    //Returns the absolute value of any double
    /**
     * 
     * @param x - the number that the method is going to return the absolute value of
     * @return - the absolute value of x as a double
     */
    public static double abs(double x){
        if(x < 0){
            x = x * -1.0;
        } else if (x == 0){
            x = 0.0;
        } 

        return x;
    }

    //Returns the value of a base to the power of its exponent
    /**
     * 
     * @param base - the base number of the power function, the number being multiplied by the exponent amount of times
     * @param exponent - the exponent that the base number is raised to, multiples the base by exponent amount of times
     * @return - base multiplied by itself exponent amount of times
     */
    public static double pow(double base, int exponent){
        double num = 1.0;

        if(exponent > 0){
            for(int i = exponent; i > 0; i--){
                num = num * base;
            }
        } else if(exponent == 0){
            num = 1;
        }

        return num;
    }

    //Returns the square root of a number if it's a whole number, if no whole square roots, then returns as -1
    /**
     * 
     * @param x - the number that the method is going to return the perfect square root of
     * @return - if the int x has a perfect square root, then it returns the perfect square root, but if no perfect square root is found, then returns as -1
     */
    public static int perfectSqrt(int x){
        int num = x;

        if(x == 0){
            num = 0;
        } else if(x > 0){
            for(int i = 1; i <= x; i++){
                if((x % i == 0) && (x / i == i)){
                    num = i;
                }
            }

            if(num == x){
                num = -1;
            }
        } else{
            num = -1;
        }
        
        return num;
    }
}