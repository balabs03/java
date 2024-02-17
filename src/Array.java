import java.util.*;
public class Array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //initial zero for int
        System.out.println("initial zero for int");
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
        System.out.println();

        //initial null for String
        System.out.println("initial null for String");
        String[] str = new String[5];
        System.out.println(Arrays.toString(str));
        System.out.println();

        //input
        System.out.println("Input");
        System.out.println("INPUT METHOD - 1");
        System.out.println("::::::::::::::::::::");
        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;
        System.out.println(Arrays.toString(arr2));
        System.out.println("INPUT METHOD - 2");
        System.out.println("::::::::::::::::::::");
        int[] arr3 = new int[5];
        System.out.println("Give input >>>>>>");
        for(int i = 0;i<arr3.length;i++){
            arr3[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr3));

        //output
        System.out.println("output");
        System.out.println("OUTPUT METHOD - 1");
        System.out.println("::::::::::::::::::::");
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.print(arr[4]+" ");
        System.out.println();
        System.out.println("OUTPUT METHOD - 2");
        System.out.println("::::::::::::::::::::");
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("OUTPUT METHOD - 3");
        System.out.println("::::::::::::::::::::");
        for(int k:arr2){
            System.out.print(k+ " ");
        }
        System.out.println();
        System.out.println("OUTPUT METHOD - 4");
        System.out.println("::::::::::::::::::::");
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        //Arrays for Objects
        System.out.println("ARRAYS FOR OBJECTS");
        System.out.println("::::::::::::::::::::");
        String[] strArray = new String[5];
        System.out.println("Give input >>>>>>");
        for(int i = 0;i<strArray.length;i++){
            strArray[i] = sc.next();
        }
        System.out.println(Arrays.toString(strArray));
        System.out.println();

        //Arrays for Functions
        System.out.println("ARRAYS FOR FUNCTIONS");
        System.out.println("::::::::::::::::::::");
        int[] nums = {2,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99999;
    }
}
