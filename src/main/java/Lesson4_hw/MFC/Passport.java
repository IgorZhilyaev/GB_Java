package Lesson4_hw.MFC;

public class Passport extends Tasks{

    @Override
    public long time() {
        return 5000;
    }

    @Override
    public int prioritet() {
        return 5;
    }

    @Override
    public String toString(){

        return "Мы выполняем задачу выдача паспорта.\nВремя на задачу " + time() + ", " + "приоритет задачи " + prioritet() + ".";
    }
}
