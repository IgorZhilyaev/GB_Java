package Lesson2;
// Опредлить, является ли строка палиндромом.
public class Task02 {

    public static void main(String[] args) {

        String word = String.valueOf(checkPalindrome("tenet"));
        System.out.println(word);
        String cycleWord = String.valueOf(cycle("tene"));
        System.out.println(cycleWord);
    }

    public static boolean checkPalindrome(String str){

        String reversStr = new StringBuilder(str).reverse().toString();
        if (reversStr.equals(str)){
            return true;
        }else {
        return false;
        }
    }

    public static boolean cycle(String str){

        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {

            result += str.charAt(i);
            
        }

        if (result.equals(str)){
            return true;
        }else {
            return false;
        }
    }

}
