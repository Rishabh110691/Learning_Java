package Programs;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc1.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc1.nextInt();

        System.out.println("Addition is: "+num1+num2);
        System.out.println("Multiplication is: "+ num1*num2);
        System.out.println("Substraction is: "+ (num1-num2));
        System.out.println("Division is: "+ num1/num2);
        System.out.println("Mod is: "+ (num1%num2));

    }
}
