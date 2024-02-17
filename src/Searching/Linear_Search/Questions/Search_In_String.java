package Searching.Linear_Search.Questions;

public class Search_In_String {
    public static void main(String[] args) {
        String str = "balakumaran";
        char ch = 'n';
        System.out.println(search2(str,ch));
    }
    static boolean search2(String str,char target){
        if(str.isEmpty()) return false;
        for(char ch : str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }
    static boolean search(String str,char ch){
        if(str.isEmpty()) return false;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ch) return true;
        }
        return false; 
    }
}
