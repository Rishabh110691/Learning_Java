package Programs;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the first no");
        int num1=sc1.nextInt();
        System.out.println("Enter the second no");
        //Scanner sc2=new Scanner(System.in);
        int num2=sc1.nextInt();
        System.out.println("Multiplication is:"+(num1*num2));
    }
}
