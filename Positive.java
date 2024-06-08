import java.util.*;
class Integer {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println("entered number is equal to zero");
        }
        else if(n>0)
        {
         System.out.println("entered number is greter than zero");   
        }
        else
        {
            System.out.println("entered number is less than zero");
        }
    }
}
