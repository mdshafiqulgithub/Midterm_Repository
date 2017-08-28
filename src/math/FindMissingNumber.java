package math;

/**
 * Created by mrahman on 04/22/17.
 */
 /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.

*/




public class FindMissingNumber
{

    public static void main(String[] args)
    {

        int[] arr1={10,2,1, 4, 5, 3, 7, 8, 6};
        System.out.println("Missing number from array arr1: "+missingNumber(arr1));

    }

    public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}