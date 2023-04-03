package Programs;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number for table:");
        int a=sc1.nextInt();

        int i=1;
        while(i<11)
        {
            System.out.println(a+"*"+i+"="+a*i);
            i++;
        }




    }
}
