import java.util.Scanner;
public class armstrong
{
    public static void main(String[]args) 
{
    int n=153,sum=0,temp=n;
    while(n>0)
        {
            int digit =n % 10 ;
            int cube = digit * digit *digit ;
            sum = sum + cube;
            n = n / 10 ;
         } 
         n = temp;
         if(n==sum)
        System.out.println("its an armstrong number");
        else
        System.out.println("its not a armstrong number");
         
    }
}
