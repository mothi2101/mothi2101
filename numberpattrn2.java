import java.util.Scanner;

public class numpatten1 
{
    public static void main(String[]args)
    {
      Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=0;i<n;i++)//rows
        {
            for (int j=0;j<n;j++)//colms
            {
                System.out.print((i+1) + " ");
            }
            System.out.print("\n");
        }
    }
    }
