class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int j=1;
        for(int i=0; i<n-1; i++){
            if(nums[j]-nums[i]==1){
                count++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
