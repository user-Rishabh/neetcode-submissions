class Solution {
    public boolean search(int[] arr, int target) {
        
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start  + (end-start)/2;

            if (arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return true;
            }
        }
        return false;

    }
}