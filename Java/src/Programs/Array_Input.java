package Programs;

import java.util.Scanner;

public class Array_Input
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
          int a= sc.nextInt();
        int[] array= new int[a];
        for (int i=0;i< array.length;i++)
        {
            System.out.println("Enter the data for index"+i);
            array[i]=sc.nextInt();
        }
        for (int j=0;j< array.length;j++)
        {
            int b= array[j];
            System.out.print(b);

        }
        for (int b:array
             ) {
            System.out.print(b);
        }
    }

}
