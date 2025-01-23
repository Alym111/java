import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите число:");

        Integer chislo=scan.nextInt();
        String str = String.valueOf(chislo);
        if (isPalindrome(str)) {
            System.out.println("Это палиндром!");
        } else {
            System.out.println("Это не палиндром.");
        }
    }

    public static boolean isPalindrome(String n) {
        if (n.length() <= 1){
            return true;
        }
        if (n.charAt(0)!=n.charAt(n.length()-1)){
            return false;
        }
        else{
            return isPalindrome(n.substring(1, n.length() - 1));
        }
    }
}


