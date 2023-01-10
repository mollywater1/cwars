import java.util.Arrays;
/* Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid. */
public class HighestScoringWord {
     public static void main(String[] args) {
         int value = 0;
         String t="man i need a taxi up to ubud";
         int winner=0,trueIndex=0;
         String[] data = t.split(" ");
         System.out.println(Arrays.toString(data));
         int[] Sum = new int[data.length];
         for(int i=0;i<data.length;i++)
         {
             int sum=0;

             char[] temp = data[i].toCharArray();
             for(int j=0;j<temp.length;j++) {
                 value = temp[j];
                 sum += value - 96;
             }
             Sum[i]=sum;
         }
         for(int i=0;i<Sum.length;i++)
         {
             System.out.println(Sum[i]);
             if(Sum[i]>winner)
             {
                 winner=Sum[i];
                 trueIndex=i;
             }
         }
         System.out.println(data[trueIndex]);





     }

}
