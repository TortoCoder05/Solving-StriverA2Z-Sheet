3)Hashing :
1)Frequencies of limited range array : 
  TC : O(N) & SC : O(N)
    class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=1;i<=n;i++){
            hm.put(i,0);
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int f = hm.get(arr[i]);
                hm.put(arr[i],f+1);
            }
        }
      ArrayList<Integer> al = new ArrayList<>(hm.values());
      return al;
    }
}
                                 OR

class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
       HashMap<Integer,Integer> hm = new HashMap<>();
       ArrayList<Integer> al = new ArrayList<>();
       int n = arr.length;
       for(int i=1;i<=n;i++){
           hm.put(i,0);
       }
       for(int i=0;i<n;i++){
           if(hm.containsKey(arr[i])){
               int f = hm.get(arr[i]);
               hm.put(arr[i],f+1);
           }
       }
       for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
           al.add(entry.getValue());
       }
       return al;
    }
}
2)Highest/Lowest Frequency :
import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        int[] ans = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = v.length;
        //Storing array elements into a hashmap
        for(int i=0;i<n;i++){
            if(hm.containsKey(v[i])){
                int f = hm.get(v[i]);
                hm.put(v[i],f+1);
            }
            else{
                hm.put(v[i],1);
            }
        }
        int maxEle = 0;
        int minEle = 0;
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
          int count = e.getValue();
           if (count > maxFreq) {
                maxEle = e.getKey();
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = e.getKey();
                minFreq = count;
            }
            if(count == minFreq){
                minEle = Math.min(e.getKey(),minEle);
            }
            if(count == maxFreq){
                maxEle =Math.min(e.getKey(),maxEle);
            }

        }
        ans[0] = maxEle;
        ans[1] = minEle;
        return ans;
    }
}
