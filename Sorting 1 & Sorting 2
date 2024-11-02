Sorting 1 :
1. Selection Sort -> TC : O(N^2) SC : O(1)
class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int n = arr.length;
        int min = i;
       for(int j=i;j<n;j++){
           if(arr[j]< arr[min]){
               min = j;
           }
       } 
       return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    
	    for(int i=0;i<n-1;i++){
	       int m =  select(arr,i);
	        int temp = arr[i];
	        arr[i] = arr[m];
	        arr[m] = temp;
	    }
	}
}
2.Bubble Sort -> TC : O(N^2) SC : O(1)
//User function Template for Java

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
      for(int i=1;i<n;i++){
          int swap = 0;
          for(int j=0;j<n-1;j++){
              if(arr[j] > arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  swap++;
              }
          }
          if(swap == 0){
              break;
          }
      }  //code here
    }
}
3.Insertion Sort -> TC:O(N^2) SC : O(1)
class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
    for(int i=1;i<n;i++){
        for(int j=i-1;j>=0;j--){
            if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            }
        else{
            break;
        }
        }
    } 
  }
} 
2)Sorting 2 :
1.Merge Sort -> TC : O(NlogN) SC : O(N)
class Solution {

    void mergeSort(int arr[], int low, int high) {
        // code here
        if(low >= high)
            return;
        int mid = (low + high)/2;
         // Sort first half
        mergeSort(arr, low, mid);
        
        // Sort second half
        mergeSort(arr, mid + 1, high);
        
        // Merge the sorted halves
        merge(arr, low, mid, high);
    }
    void merge(int[] a,int s,int m,int e){
        int[] temp = new int[e-s+1];
        int p1 = s,p2 = m+1,p3 = 0;
        while(p1 <= m && p2 <= e){
            if(a[p1] <= a[p2]){
                temp[p3] = a[p1];
                p1++;
                p3++;
            }
            else{
                temp[p3] = a[p2];
                p2++;
                p3++;
            }
        }
        while(p1 <= m){
            temp[p3] = a[p1];
            p1++;
            p3++;
        }
        while(p2 <= e){
            temp[p3] = a[p2];
            p2++;
            p3++;
        }
        int k = 0;
        for(int i=s;i<=e;i++){
            a[i] = temp[k];
            k++;
        }
    }
}
2.Recursive Bubble Sort -> TC : O(N^2) SC : O(1)
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        if(n == 0){
            return;
        }
        Sort(arr,n-1);
        bubbleSort(arr,n-1);
    }
    public static void Sort(int[] a,int n)
    {
            for(int j=0;j<n;j++){
              if(a[j] > a[j+1]){
                  int temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
                }
            }
    }
}
3.Recursive Insertion Sort -> TC : O(N^2) SC : O(1)
class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
      for(int j=i-1;j>=0;j--){
       if(arr[j] > arr[j+1]){
       int temp = arr[j];
       arr[j] = arr[j+1];
       arr[j+1] = temp;
       }
      else{
          break;
      }
      }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
    if(n == 0){
        return;
    }
    insertionSort(arr,n-1);
    insert(arr,n-1);
  }
}
4.Quick Sort -> TC : O(N*logN) SC : O(logN)
class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
         if(low >= high)
           return;
        int p = partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high); 
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int x = arr[high];
        int j = low;
        for(int i=low;i<high;i++){
            if(arr[i] < x){
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                j++;
            }
        }
            int temp2 = arr[j];
            arr[j] = arr[high];
            arr[high] = temp2;
            return j;
    } 
}

