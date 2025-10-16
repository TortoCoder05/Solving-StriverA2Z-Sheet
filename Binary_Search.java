1.Binary Search to find X in sorted array : 
class Solution {
    public int search(int[] nums, int target) {
    int n = nums.length;
    int l = 0;
    int h = n-1;
    while(l <= h){
        int mid = (l+h)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            l = mid + 1;
        }
        else{
            h = mid - 1;
        }
    }
    return -1;
    }
}
2. Implement Lower Bound : 
class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        int ans = n;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] == target){
                ans = m;
                 h = m - 1;
            }
            else if(arr[m] > target){
                ans = m;
                h = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return ans;
    }
}
3. Implement Upper Bound : 
class Solution {
    int upperBound(int[] arr, int target) {
        // code here
         int n = arr.length;
        int l = 0;
        int h = n - 1;
        int ans = n;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] == target){
                l = m + 1;
            }
            else if(arr[m] > target){
                ans = m;
                h = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return ans;
    }
}
4. Search Insert Position : 
class Solution {
    public int searchInsert(int[] A, int B) {
       int n = A.length;
        int l = 0;
        int h = n - 1;
        int ans = n;
        while(l <= h){
            int m = (l+h)/2;
            if(A[m] == B){
                return m;
            }
            else if(A[m] > B){
                ans = m;
                h = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return ans; 
    }
}
5. Floor in a sorted array :
class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
       int n = arr.length;
        int l = 0;
        int h = n - 1;
        int ans = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] <= x){
                ans = m;
                l = m + 1;
            }
            else{
                h = m - 1;
            }
        }
        return ans; 
    }
}
6. Ceil in a sorted array : 
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
         int n = arr.length;
        int l = 0;
        int h = n - 1;
        int ans = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(arr[m] >= x){
                ans = m;
                 h = m - 1;
               
            }
            else{
                l = m + 1;
            }
        }
        return ans; 
    }
}
7.Find First and Last Position of Element in Sorted Array :
    class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans = new int[2];
       ans[0] = firstIndex(nums,target);
       ans[1] = lastIndex(nums,target);
       return ans;
    }
 public int firstIndex(int[] ar,int k){
     int n = ar.length;
     int first = -1;
     int l = 0;
     int h = n-1;
     while(l<=h){
         int m = (l+h)/2;
         if(ar[m] == k){
            first = m;
            h = m-1; 
         }
         else if(ar[m] < k){
             l = m + 1;
         }
         else{
             h = m - 1;
         }
     }
     return first;
 }
 public int lastIndex(int[] ar,int k){
     int n = ar.length;
     int l = 0;
     int h = n-1;
     int last = -1;
     while(l<=h){
         int m = (l+h)/2;
         if(ar[m] == k){
             last = m;
             l = m + 1;
         }
         else if(ar[m] < k){
             l = m + 1;
         }
         else{
             h = m - 1;
         }
     }
     return last;
 }
}
8. Number of occurrence
class Solution {
        // code here
    int countFreq(int[] nums, int target) {
       int fi= firstIndex(nums,target);
       int la = lastIndex(nums,target);
       if(fi >= 0 && la >= 0){
            return la-fi+1;
       }
       return 0;
    }
 public int firstIndex(int[] ar,int k){
     int n = ar.length;
     int first = -1;
     int l = 0;
     int h = n-1;
     while(l<=h){
         int m = (l+h)/2;
         if(ar[m] == k){
            first = m;
            h = m-1; 
         }
         else if(ar[m] < k){
             l = m + 1;
         }
         else{
             h = m - 1;
         }
     }
     return first;
 }
 public int lastIndex(int[] ar,int k){
     int n = ar.length;
     int l = 0;
     int h = n-1;
     int last = -1;
     while(l<=h){
         int m = (l+h)/2;
         if(ar[m] == k){
             last = m;
             l = m + 1;
         }
         else if(ar[m] < k){
             l = m + 1;
         }
         else{
             h = m - 1;
         }
     }
     return last;
 }
}
9.Find Peak Element
    class Solution {
    public int findPeakElement(int[] nums) {
     int n = nums.length;
    if(n == 1){
        return 0;
     }
     if(nums[0] > nums[1]){
        return 0;
     }
     if(nums[n-1] > nums[n-2]){
        return n-1;
     }
     int l = 1;
     int h = n-2;
     while(l <= h){
        int m = (l+h)/2;
        if(nums[m] > nums[m-1] && nums[m] > nums[m+1]){
            return m;
        }
        else if(nums[m] < nums[m+1]){
            //go to right
            l = m + 1;
        }
        else{
            //go to left 
            h = m - 1;
        }
     }   
     return -1;
    }
}
10. Search in Rotated Sorted Array I 
    class Solution {
    public int search(int[] nums, int target) {
     int n = nums.length;
     int st=0,end=n-1;
      while(st <= end){
        int m = st + (end-st)/2;
        if(nums[m] == target){
            return m;
        }
        if(nums[st] == nums[m] && nums[m] == nums[end]){
            st++;
            end--;
        }
        else if(nums[st] <= nums[m]){ //left sorted
        if(nums[st] <= target && target<= nums[m]){
            //goto left
            end = m - 1;
        }
        else{
            st = m + 1;
        }
        }
        else{//right sorted
        if(nums[m] <= target && target <= nums[end]){
         //goto right
         st = m + 1;
        }
        else{
            end = m - 1;
        }
        }
      }
      return -1;
    }
}
11. Search in Rotated Sorted Array II
    class Solution {
    public boolean search(int[] nums, int target) {
     int n = nums.length;
     int st=0,end=n-1;
      while(st <= end){
        int m = st + (end-st)/2;
        if(nums[m] == target){
            return true;
        }
        if(nums[st] == nums[m] && nums[m] == nums[end]){//if duplicates present 
            st++;
            end--;
        }
        else if(nums[st] <= nums[m]){ //left sorted
        if(nums[st] <= target && target<= nums[m]){
            //goto left
            end = m - 1;
        }
        else{
            st = m + 1;
        }
        }
        else{//right sorted
        if(nums[m] <= target && target <= nums[end]){
         //goto right
         st = m + 1;
        }
        else{
            end = m - 1;
        }
        }
      }
      return false;
    }
}
  
