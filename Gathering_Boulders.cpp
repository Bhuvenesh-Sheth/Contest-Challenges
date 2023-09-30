/*
 * You are given an array weightArr containing weights of N boulders,
 * weightArr[i] is the weight of a boulder kept at index i. You have to
 * decide an index k from the indices (0,..., N-1), where you have to set up a processinig unit to crush boulders into fine sand.

You have to move boulders towards index k. Boulder at index i could be moved to index k with the cost weightArr[i]*|k-il.

What could be the minimum cost of gathering the boulders if you select the optimal index k?
 */
class Gathering_Boulders {
    long long MinCost(int n, int weightsArr[]){
        long long a =0;
        long long b = n-1;
        while(a<b)
        {
            int mid = a + (b-a)/2;
            int sumMid=0;
            int sumMidPlusOne=0;
            int hello;
            for( int i=0;i<n;i++)
            {
                long long diffmid = abs(mid-i);
                long long diffmidplusone = abs(mid+1-i);
                sumMid = sumMid + weightsArr[i] * diffmid;
                sumMidPlusOne = sumMidPlusOne + weightsArr[i]*diffmidplusone;
            }
            if(sumMid <= sumMidPlusOne)
            {
                hello = mid;
                b  = hello;
            }  else {
                a=mid+1;
            }
        }
        int k =a;
        long long result  =0;
        for( int i=0;i<n;i++)
        {
            int diff = abs(k-i);
            result = result + (weightsArr[i]*diff);
        }
        
        return result;
    }
}
