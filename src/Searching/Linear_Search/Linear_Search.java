package Searching.Linear_Search;

public class Linear_Search{
    public static void main(String[] args) {
        int[] arr ={20,27,67,89,98,876,47,23,45,9990};
        int target = 9990;
        int index = searchAndReturnIndex(arr,target);
        int element = searchAndReturnElement(arr,9990);
        System.out.println(check(arr,98));
        System.out.println(index);
        System.out.println(element);
    }
    static int searchAndReturnIndex(int[] nums,int target){
        if(nums.length == 0) return -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }
    static int searchAndReturnElement(int[] nums,int target){
        if(nums.length == 0) return Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target) return target;
        }
        return Integer.MAX_VALUE;
    }
    static boolean check(int[] nums,int target){
        if(nums.length == 0) return false;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target) return true;
        }
        return false;
    }
}
