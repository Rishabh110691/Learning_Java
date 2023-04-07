package Programs;

public class Array_Substring {
    public static void main(String[] args) {
        String str="Rishabh";
        for(int i=0;i<str.length();i++)
        {
            for (int j=i;j<str.length();j++)
            {
               String s= str.substring(j);
                System.out.print(s+"  ");
            }

            System.out.println();

        }

    }
}
