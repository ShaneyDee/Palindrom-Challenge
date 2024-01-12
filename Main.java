import java.util.*;

class Main {

    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = sc.nextLine();

        StringBuilder strb = new StringBuilder(str);
        strb = strb.reverse();

        String rev = strb.toString();

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
        
}
