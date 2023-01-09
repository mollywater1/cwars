import java.util.Arrays;

public class FindTheParityOutlier {
    public static void main(String[] args)
    {

        int[] array= new int[]{160, 3, 1719, 19, 11, 13, -21};
        System.out.println(String.valueOf(find(array)));
    }
    static int find(int[] integers) {
        int even=0,odd=0,res=0;
        for(int i=0;i<integers.length;i++)
        {
            if(integers[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        if(even>1)
        {
            for(int i=0;i<integers.length;i++)
            {
                if(integers[i]%2!=0)
                {
                    res= integers[i];
                }
            }
        }
        if(odd>1)
        {
            for(int i=0;i<integers.length;i++)
            {
                if(integers[i]%2==0)
                {
                    res=integers[i];
                }
            }
        }
        return res;
    }
}
/* You are given an array (which will have a length of at least 3, but could be very large)
containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except
for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */