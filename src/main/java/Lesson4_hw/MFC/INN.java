package Lesson4_hw.MFC;

public class INN extends Tasks{


    @Override
    public long time() {
        return 3000;
    }

    @Override
    public int prioritet() {
        return 2;
    }

    @Override
    public String toString(){

        return "Мы выполняем задачу выдача ИНН.\nВремя на задачу " + time() + ", " + "приоритет задачи " + prioritet() + ".";
    }
}
