'''java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int ans[] = new int[2];
        for(int i = 0; i<nums.length;i++){
            int abs = target-nums[i];
            if(hm.containsKey(abs)){
                ans[0] = hm.get(abs);
                ans[1] = i;
                break;
                
            }else{
                hm.put(nums[i],i);
            }
        }
        return ans;
        
    }
}
'''
