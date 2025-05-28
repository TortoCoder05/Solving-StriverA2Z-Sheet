2) Recursion Basic Problems : 
1)Print 1 to N :
class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        if(N == 1){
            System.out.print(N +" ");
            return;
        }
        printNos(N-1);
         System.out.print(N +" ");
    }
}
2)Print N to 1 :
class Solution {

    void printNos(int N) {
        // code here
        if(N == 1){
           System.out.print(1 +" ");
            return;
        }
         System.out.print(N +" ");
          printNos(N-1);
    }
}
3)Sum of first n terms :
class Solution {
    int sumOfSeries(int n) {
        // code here
        if(n == 0){
            return 0;
        }
           return sumOfSeries(n-1) + (n * n * n);

    }
}
//Without Recursion 
class Solution {
    long sum = 0;
    long sumOfSeries(long n) {
        sum = (n * n * (n+1) * (n+1))/4;
        return sum;
}
}
4)Find all factorial numbers less than or equal to n :
// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        long sum = 0;
        for(long i=1;sum<=n;i++){
            sum = fact(i);
            if(sum <= n){
                ans.add(sum);
            }
        }
        return ans;
    }
    static long fact(long N){
        if(N == 0){
            return 1;
        }
        return N*fact(N-1);
    }
}
5)Check if a string is palindrome or not :
class Solution {
    public boolean isPalindrome(String s) {
      String str = alphaNumeric(s);
      int st = 0;
      int en = str.length()-1;
      return isItPalindrome(str,st,en);
    }
      String  alphaNumeric(String S){
        S = S.replaceAll("[^a-zA-Z0-9]","");
        int n = S.length();
        for(int i=0;i<n;i++){
            char ch = S.charAt(i);
            if(ch >= 65 && ch <= 90){
                S = S.toLowerCase();
            }
        }
        return S;
      } 
      public boolean isItPalindrome(String st,int start,int end){
        if(start >= end){
            return true;
        }
        if(st.charAt(start) == st.charAt(end) && isItPalindrome(st,start+1,end-1)){
            return true;
        }
        return false;
      }
}
6)Fibonacci Number :
class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
} 




