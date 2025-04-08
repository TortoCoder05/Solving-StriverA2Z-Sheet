Basic Maths : 
1)Count Digits :
//User function Template for Java
class Solution{
    static int evenlyDivides(int N){
        // code here
       int count = 0;
       int original = N;
        while(N > 0){
            int digit = N % 10;
            if(digit != 0 &&  original % digit == 0){
                count++;
            }
            N = N / 10;
        }
        return count; 
    }
}
2)Reverse a Number :
class Solution {
    public int reverse(int x) {
        int rev = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (rev > max / 10 || (rev == max && digit >= max % 10)) {
                return 0;
            }
            if (rev < min / 10 || (rev == min && digit <= min % 10)) {
                return 0;
            }
            rev = (rev * 10) + digit;
        }
        return rev;
    }
}
3)Check Palindrome : 
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while(x != 0){
         int d = x % 10;
         x = x/10;
         rev = (rev * 10) + d;
        }
        if(rev < 0){
            return false;
        }
        if(rev == temp){
            return true;
        }
        return false;
    }
}   
                         OR
class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
     if(x < 0 || x % 10 == 0){
        return false;
     }
     int rev = 0;
     while(x > rev){
        rev = rev * 10 + (x % 10);
        x = x / 10;
     }  
     //Handling both for odd and even length palindromes
     if(x == rev || x == rev / 10){
        return true;
     } 
     else{
        return false;
     }
    }
}
4)GCD Or HCF : 
5)Armstrong Numbers : 
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int n =scn.nextInt();
// Write your code here
 int sum = 0;
 int temp = n;
int numOfDigit = 0;
while(n > 0)
{
        n = n/10;
        numOfDigit++;
}
        n = temp;
        while(n > 0){
         int d = n % 10;
         n = n/10;
         sum = sum + (int)Math.pow(d,numOfDigit);
        }
        if(sum == temp){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

	}
}
6)Sum of all divisors from 1 to n : 
//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        // code here
        long sum = 0;
        for(int i=1;i<=N;i++){
            sum = sum + N/i * i;
        }
        return sum;
    }
}
7)Check for Prime : 
public class Solution {
	public static String isPrime(int num) {
		//Your code goes here
		if(num == 1){
			return "NO";
		}
	for(int i=2;i*i<=num;i++){
		if(num % i == 0){
			return "NO";
		}
	}
	return "YES";
	}
}
