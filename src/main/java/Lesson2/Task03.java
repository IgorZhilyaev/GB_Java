package Lesson2;

//Сократить строку вида aaabbbssskkk до a3b3s3k3

public class Task03 {

    public static void main(String[] args) {

        System.out.println(compress("aaabbbssskkk"));

    }

    public static String compress(String arg) {

        int count = 1;
        String result = "";

        for (int i = 1; i < arg.length(); i++) {

            if (arg.charAt(i-1) == arg.charAt(i)) {
                count++;
            } else {
                result += arg.charAt(i-1) + Integer.toString(count);
                count = 1;
            }
            if (i == arg.length() - 1) {
                result += arg.charAt(i - 1) + Integer.toString(count);
            }

        }
        return result;
    }
}
