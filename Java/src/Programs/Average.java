package Programs;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num1?");
        int a=sc.nextInt();
        System.out.println("num2?");
        int b=sc.nextInt();
        System.out.println("num3?");
        int c=sc.nextInt();

        int avg= ((a+b+c)/3);
        System.out.println("Avg  is "+avg);
    }
}
