package Programs;

public class Array_maxmin  {
    public static void main(String[] args) {
        int[] array={8,3,5,7,6};
        int max=array[0];
        int min=array[0];
        for (int i=1;i<array.length;i++)
        {
            if (array[i]>max)
            {
                max= array[i];
            }
        }
        System.out.println(max);
        for (int j=0;j<array.length;j++)
        {
            if(array[j]<min)
            {
                min=array[j];
            }
        }
        System.out.println(min);
    }
}
