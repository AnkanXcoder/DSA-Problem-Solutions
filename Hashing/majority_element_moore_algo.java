class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0,candidate = -1;

        // find candidate
        for(int i=0;i<n;i++) {
            if(count == 0) {
                candidate = nums[i];
                count = 1;
            }
            else {
                if(nums[i] == candidate) {
                    count++;
                }
                else {
                    count--;
                }
            }
        }

        // find majority element
        for(int i=0;i<n;i++) {
            if(nums[i] == candidate) {
                count++;
            }
            if(count > nums.length/2) {
                return candidate;
            }
        }
        return -1;

    
    }
}