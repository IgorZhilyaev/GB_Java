package Lesson4_hw.MFC;

public abstract class Tasks {

    public abstract long time();

    public abstract int prioritet();

    public String number(){
        return Integer.toString((int) (Math.random()*100));
    }

}
