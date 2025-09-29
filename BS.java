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
2. Search Insert Position : 
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
