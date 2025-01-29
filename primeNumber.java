public class primeNumber
{
 public static void main(String[]args)
 {
    int n,i,count =0;
    n=4;
    for(i=1;i<=n;i++)
    {
        if (n%i==0)
        count++;
    }
    if(count==2)
    {
        System.out.println("Its a prime number");
    }
    else
    {
        System.out.println("Its not a prime number");
    }
 }
}
