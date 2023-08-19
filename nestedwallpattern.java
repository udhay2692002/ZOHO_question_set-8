public class nestedwallpattern
{

    public static void main(String [] args)
    {
        int n=4;
        int front=0;
        int size=n*2-1;
        int last=size-1;
        int max=n*2;
        int[][] matrix=new int[max][max];

        while(n!=0)
        {
            for(int i=front;i<=last;i++)
            {
                for(int j=front;j<=last;j++)
                {
                    if(i==front||j==last||i==last||j==front) {
                        matrix[i][j] = n;
                    }
                }
            }

            n--;
            front++;
            last--;
        }

        for(int k=0;k<matrix.length-1;k++)
        {
            for(int z=0;z<matrix.length-1;z++)
            {
                System.out.print(matrix[k][z]);
            }
            System.out.println();
        }
    }

}
