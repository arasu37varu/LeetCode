class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<size;i++){
            if(map.containsKey(target - nums[i])){
                ans[1] = i;
                ans[0] = map.get(target - nums[i]);
                break;
            }
            else{
                map.put(nums[i],i);
                }
        }
        return ans;
    }
}
