public class Main 
{
    public static void main(String[] args)
    {
        int n=5;
        /*
        for(int i=1;i<=n;i++)
        {
            for(int k=n-1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(i)-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        for(int i=n-1;i>=1;i--)
        {
            for(int k=i;k>=n;k--)
            {
                System.out.print(" ");
            }
            
            for(int j=2*(i)-1;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
