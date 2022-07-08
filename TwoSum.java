class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int arr[] = new int[2];
    
       for(int i = 0; i < length-1;i++){
            for(int j = i+1;j < length;j++){
             if(nums[i]+nums[j] == target){
                 arr[0] = i;
                 arr[1] = j;
                    break; 
                }
             }
       }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {3,3};
        int target = 6;
        twoSum(nums , target);
    }
}