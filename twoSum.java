//https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/

class Solution {
    
     public int[] twoSum(int[] nums, int target) {
         
        int [] retVal = new int[2];
        HashSet<Integer> numsHashSet = new HashSet<>();
         
        for (int i=0; i<nums.length; i++) {
            numsHashSet.add(nums[i]);
            
            Integer otherValue = target - nums[i];
            if(numsHashSet.contains(otherValue)) {
                for (int j=0; j<nums.length; j++) {
                    if (nums[j] == otherValue && j != i) {
                        retVal[0] = j;
                        retVal[1] = i;
                        break;
                    }
                }
            }
        } 

        return retVal;
    }

}
