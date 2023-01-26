package LessonInterface;

public class Sausage extends Product implements Promotion {
    public Sausage(String title, int price, int count) {
        super(title, price, count);
    }

    @Override
    public void chooseOption() {
        System.out.println("Выберите вареную или полукопченую.");
    }

    @Override
    public void toPay() {
        System.out.println("заказ оплачен наличными");
    }


    @Override
    public int promo2Plus1(int count) {
        System.out.println("При покупке двух колбас 3-я бесплатно");
        return count / 3 * 2 + count % 3;

    }

    @Override
    public int discount20(int price) {
        return 0;
    }

    @Override
    public void presentForShip() {

    }

    public void orderSlicing() {
        System.out.print("Колбаса будет нарезана пластиками. ");
    }


}
