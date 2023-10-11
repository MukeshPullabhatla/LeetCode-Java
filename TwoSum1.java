import java.util.*;
public class TwoSum1 {
    //BruteForce
    public static int[] twoSum(int[] nums, int target){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j< nums.length;j++){
                if(target == nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    //Optimized
    public static int[] twoSumOptimized(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for(int i=0;i<result.length;i++){
            System.out.println(i);
        }
        int[] optimizedResult = twoSumOptimized(nums, target);
        for(int i=0;i<optimizedResult.length;i++){
            System.out.println(i);
        }
    }
}
