class Solution {
    
     /**
     * Given an array of integers nums and an integer target, returns indices of the two numbers such that they add up to target.
     * Assumes that each input would have exactly one solution, and the same element is not used twice.
     * Returns with index[0] < index[1].
     *
     * Constraints: 2 <= nums.length <= 10^5,  -10^9 <= nums[i] <= 10^9,   -10^9 <= target <= 10^9
     */
     public int[] twoSum(int[] nums, int target) {
        int [] retVal = new int[2];
        HashSet<Integer> numsHashSet = new HashSet<>();
         
        for (int i=0; i<nums.length; i++) {
            numsHashSet.add(nums[i]);
            Integer otherValue = target - nums[i]; 
            // if nums[i] + otherValue equals target we've found the pair. 
            if(numsHashSet.contains(otherValue)) {
                for (int j=0; j<nums.length; j++) {
                    if (nums[j] == otherValue && j != i) {
                        retVal[0] = j;
                        retVal[1] = i;
                        break;
                    }
                }
            }
            if (retVal[1] !=0)  // index 1 will not be 0 if assigned.
                break;
        } 
        return retVal;
    }

}
