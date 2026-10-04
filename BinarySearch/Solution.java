package BinarySearch;

class Solution {
    public int search(int[] nums, int target) {
        int low,high,mid = 0;
        low=0;
        high=nums.length-1;
        while(low<=high) {
            mid = low + (high - low) / 2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] nums = {1, 3, 5, 7, 9};
        System.out.println(s.search(nums, 6));
    }
}