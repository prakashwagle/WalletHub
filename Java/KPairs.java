import java.util.*;

class KPairs
{
    public static void main(String[] args) {
         int[] ints = {-8,2,5,3,1,13,4,21,9};
         int K=6;
         HashSet<String> resultSet;
         Iterator<String> it;
         KPairs kPairs = new KPairs();

        resultSet = kPairs.checkPair(ints,K);
        it = resultSet.iterator();
          try{
            while (it.hasNext()) {
                System.out.println("K-Pair: "+K+" -> [ "+it.next()+" ]");
            }
        } catch (Exception e){e.printStackTrace();}

    }


    public HashSet<String> checkPair(int[] input,int K)
    {
        HashSet<Integer> hashSet = new HashSet();
        HashSet<String> resultSet = new HashSet();
        int i=0;
        int j=0;
        while (i<input.length)
        {
            hashSet.add(input[i]);
            i++;
        }

        while (j<input.length)
        {
            int sum = K - input[j];
            String str="";
            try {
                if (hashSet.contains(sum)) {
                    if (sum > input[j]) {
                        str = sum + " , " + input[j];
                    } else {
                        str = input[j] + " , " + sum;
                    }

                    resultSet.add(str);
                }
            }
            catch (Exception e){e.printStackTrace();}
            j++;
        }

        return resultSet;

    }



}