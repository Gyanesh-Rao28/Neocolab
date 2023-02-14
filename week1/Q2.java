// Write a program to find the square, cube, and square root of a number.

import java.util.Scanner;
import java.lang.Math;

public class Q2 {
    public static void main(String[] args){
        int x;

        Scanner s = new Scanner(System.in);

        x = s.nextInt();

        double Sq, Cb, Rt;

        Sq = Math.pow(x, 2);
        Cb = Math.pow(x, 3);
        Rt = Math.sqrt(x);

        System.out.println("Square of "+x+" is: "+Sq);
        System.out.println("Cube of "+x+" is: " + Cb);
        System.out.println("Square Root of " + x + " is: " + Rt);
        
    }
}
