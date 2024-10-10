package Recursion;

public class pallondrome {
    static boolean isPallondrome(String s, int i){
        if(i>s.length()/2) return true;
        else if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            return false;
        }
        return  isPallondrome(s,i+1);
    }
    public static void main(String[] args) {
        if (isPallondrome("abc", 0)){
            System.out.println("yes");

        }else System.out.println("no");

    }
}
