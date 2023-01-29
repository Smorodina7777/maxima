package LessonInterface;

public interface Promotion {
    public int promo2Plus1(int count);


    public int discount20(int price);

    public void presentForShip();

    public default void message() {
        System.out.print("На этот товар действует акционное предложение: ");
    }
}
