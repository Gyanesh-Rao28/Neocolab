// Total Expenses for the Event


import java.util.Scanner;
class Q4 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        double Total;
        double B_expenses, T_expenses, F_expenses, L_expenses;

        B_expenses = s.nextDouble();
        T_expenses = s.nextDouble();
        F_expenses = s.nextDouble();
        L_expenses = s.nextDouble();

        Total = B_expenses+T_expenses+F_expenses+L_expenses;

        B_expenses = (B_expenses / Total) * 100;
        T_expenses = (T_expenses / Total) * 100;
        F_expenses = (F_expenses / Total) * 100;
        L_expenses = (L_expenses / Total) * 100;

        System.out.print("Total expenses : Rs.");
        System.out.printf("%.2f", Total);
        System.out.println();
        System.out.printf("Branding expenses percentage : %.2f", T_expenses);
        System.out.print("%");
        System.out.println();
        System.out.printf("Travel expenses percentage : %.2f", T_expenses);
        System.out.print("%");
        System.out.println();
        System.out.printf("Food expenses percentage : %.2f", F_expenses);
        System.out.print("%");
        System.out.println();
        System.out.printf("Logistics expenses percentage : %.2f", L_expenses);
        System.out.print("%");

    }    
}
