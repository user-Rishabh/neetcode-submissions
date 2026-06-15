class Solution {
    public boolean searchMatrix(int[][] arr, int target) {

       int start = 0;
       int row = arr.length;
       int column = arr[0].length;
       int end = row*column-1;

       while (start<=end)
       {
            int mid = start + (end-start)/2;

            int mrow = mid/column;
            int mcol = mid%column;

            if (arr[mrow][mcol]>target)
            {
                end = mid-1;
            }

            else if (arr[mrow][mcol]<target)
            {
                start = mid+1;
            }
            
            else
            {
                return true;
            }
       }
       return false;



       
       

    }
}