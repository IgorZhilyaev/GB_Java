package Lesson1;

public class test {
    public static void main(String[] args) {

//        int a = 215;
//        int count = a % 10;
//        int dev = a/10;
//        System.out.println(count + "\n");
//        System.out.println(dev);
        System.out.println(GetDiv(215));

    }
    public static int GetDiv(int num) {

        if (num < 11) {
            return num;

        } else {
            int count = 0;
            while (num != 0){
                count += num % 10;
                num /= 10;
            }
            return count;
        }
}
}
