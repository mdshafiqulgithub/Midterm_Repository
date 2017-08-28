package math;

public class MakePyramid
{


        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here


    public static void main(String agrs[])
        {
        System.out.println("The Pattern is");

            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 5 - i; j++)
                { System.out.print(" "); }
                for (int k = 0; k <= i; k++)
                {
                    System.out.print("* ");
                }   System.out.println();
            }

    }
}