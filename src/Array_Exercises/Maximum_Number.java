package Array_Exercises;

public class Maximum_Number {
    public static void main(String[] args) {
        int[] arr = {14,15,54,64,3};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,2));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int maxRange(int[] arr,int start,int end){
        if(start>end){
            return -1;
        }
        if(arr.length == 0){
            return - 1;
        }
        int max = arr[start];
        for(int i = start;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
