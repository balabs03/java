import java.util.*;
public class Two_Dimensional_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input -- 1
        int[][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Input -- 2
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        for(int row = 0; row < arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // Output -- 1
        for(int row = 0; row < arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        // Output -- 2
        for(int[] a :arr){
            System.out.println(Arrays.toString(a));
        }

        // Output -- 3
        for(int row = 0;row <arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
