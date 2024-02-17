import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // To add an element to arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // To print the arraylist
        System.out.println(list);

        // To Update the arraylist
        list.set(0,999);
        System.out.println(list);

        // To check an element is there are not
        System.out.println(list.contains(5));
        System.out.println(list.contains(55));

        // To remove
        list.remove(2);
        System.out.println(list);

        ArrayList<Integer> listOne = new ArrayList<>();
        // Iterate
        for(int i = 0;i<5;i++){
            listOne.add(sc.nextInt());
        }
        // Iterate output
        for(int i = 0;i<5;i++){
            System.out.println(listOne.get(i));
        }

    }
}
