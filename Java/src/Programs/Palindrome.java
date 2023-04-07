package Programs;

public class Palindrome {
    public static void main(String[] args) {
        String str="NITIN";
        String a="";
       for (int i=str.length()-1;i>=0;i--){
          a+= str.charAt(i);
       }
        System.out.println(a);
       if (str.equals(a)){
           System.out.println("String is Palindrome");
       }
       else {
           System.out.println("String is not a palindrome");
       }
    }
}
