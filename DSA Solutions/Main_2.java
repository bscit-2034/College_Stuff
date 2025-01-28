/*
4 4 4 4 4 4 4 
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/
/*
public class Main_2 {
    public static void main(String[] args)
    {
        int n = 7;
        int m = 7;
        for (int i=1;i<=n;i++)
        {
            //System.out.print(i);
            for(int j=4;j>=i;j--)
            {
                System.out.print(j);
                for(int k=1;k<=n;k++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            //System.out.println();
        }
    }
}
 */

 public class Main_2 {
    public static void main(String[] args) {
        int n = 7; // Size of the square
        int m = 4; // Starting number

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Determine the minimum distance from the edges
                int minDistance = Math.min(Math.min(i, n - i + 1), Math.min(j, n - j + 1));
                // Calculate the number to print based on the distance from the edge
                System.out.print(m - minDistance + 1);
            }
            System.out.println();
        }
    }
}
