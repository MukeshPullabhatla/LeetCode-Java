public class TwoSum1 {
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
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for(int i=0;i<result.length;i++){
            System.out.println(i);
        }
    }
}
