package math;

/**
 * Created by mrahman on 04/22/17.
 */
/*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

public class Factorial
{
    public static void main(String args[])
    {
        Calculation obj_one = new Calculation();

        int a = obj_one.fact(4);
        System.out.println("The factorial of the number is : " + a);
    }
}

class Calculation
{
    int fact(int n)
    {
        int result;

        if(n==1)
            return 1;

        result = fact(n-1) * n;
        return result;
    }
}
