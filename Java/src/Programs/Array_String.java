package Programs;

public class Array_String{
    public static void main(String[] args) {
        String[] str={"Rishabh","Shubhada","Fluffy","Caesar"};
        for (int i=0;i<str.length;i++)
        {
            String strdata=str[i];
            if (strdata.length()<7)
            {
                String s=strdata.toUpperCase();
                str[i]=s;
            }

            System.out.println(str[i]);
        }
    }
}
