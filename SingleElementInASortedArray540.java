import java.util.*;

public class SingleElementInASortedArray540 {
    public static int singleNonDuplicate(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(mid%2==1){
                mid-=1;
            }
            if(nums[mid]==nums[mid+1]){
                left = mid+2;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
    //Using HashSet
    public static int singleNonDuplicateHashSet(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        return set.iterator().next();
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
        System.out.println(singleNonDuplicateHashSet(nums));
        int[] nums1 = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums1));
        System.out.println(singleNonDuplicateHashSet(nums1));
    }
}
