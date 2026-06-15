class Solution {
    public void moveZeroes(int[] arr) {
        
        int temp=0;
    
    for (int i =0; i<arr.length; i++)
    {
        for (int j =i+1; j<arr.length; j++)
        {
            if (arr[i]==0 && arr[j]!=0)
            {
                temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
    }

    for (int nums: arr)
    {
        System.out.println(nums);
    }


    }
}