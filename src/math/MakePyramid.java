package math;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Rows You Want in Your Pyramid?");

        int noOfRows = sc.nextInt();
        int rowCount = 1;
        System.out.println("Here is your Pyramid");

        for (int i = noOfRows; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.println("*");
            }
            System.out.println();
            rowCount++;
        }
    }
}