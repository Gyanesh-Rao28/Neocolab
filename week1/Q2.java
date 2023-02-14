
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

        System.out.println("Square of 5 is: "+Sq);
        System.out.println("Cube of 5 is: " + Cb);
        System.out.println("Square Root of 5 is: " + Rt);
        



    }
}
