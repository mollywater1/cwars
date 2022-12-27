public class DigPow {
    public static long digPow(int n, int p) {
        long temp = 0;
        String[] value = String.valueOf(n).split("");
        for (int i = 0; i < value.length; i++) {
            temp += Math.pow(Double.parseDouble(value[i]), (p + i));
        }
        return temp % n == 0 ? temp / n : -1;
    }

    public static void main(String[] args)
    {
        for(int i=10;i<1000;i++)
        {
            for(int j=1;j<3;j++)
            {
                if(digPow(i,j)!=-1)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
//While a^1+b^2+c^3==abc
}