import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        int n=10;
        int[][] res=multiplicationTable(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%d\t",res[i][j]);
            }
            System.out.println();
        }
    }
    public static int [][] multiplicationTable(int n){
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=(i+1)*(j+1);
            }
        }

        return res;
    }
}
