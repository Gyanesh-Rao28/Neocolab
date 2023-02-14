// Given the coordinates of the left bottom vertex of the square room and the length of the side, 
//you need to write a program to determine the coordinates of the center of the room




import java.util.Scanner;

class Q1 {
    public static void main(String args[]) {
        int x, y, l;

        Scanner s = new Scanner(System.in);


        x = s.nextInt();
        y = s.nextInt();
        l = s.nextInt();

        x = x + (l / 2);
        y = y + (l / 2);

        System.out.println(x + " " + y);

        s.close();
    }
}