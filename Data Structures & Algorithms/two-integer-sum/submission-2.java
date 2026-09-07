class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ONLY FOR SORTED ARRAY
        int[] ans = new int[2];
        // int i=0;
        // int j = nums.length-1;
        // while(i<j){
        //     if(nums[i]+nums[j] == target){
        //         ans[0] = i;
        //         ans[1] = j;
        //         break;
        //     }else if((nums[i]+nums[j])>target) j--;
        //     else{
        //         i++;
        //     }
        // }
        // return ans;
        
        // FOR SORTED AND UNSORTED ARRAY
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                ans[0] = map.get(rem);
                ans[1] = i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}
