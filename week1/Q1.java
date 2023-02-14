package week1;


import java.util.Scanner;

class Q1 {
    public static void main(String args[]) {
        int x, y, l;

        Scanner s = new Scanner(System.in);

        System.out.println("val");

        x = s.nextInt();
        y = s.nextInt();
        l = s.nextInt();

        x = x + (l / 2);
        y = y + (l / 2);

        System.out.println(x + " " + y);

        s.close();
    }
}