package LessonInterface;

public class Telephone extends Product implements Promotion, Warranty {
    public Telephone(String title, int price, int count) {
        super(title, price, count);
    }

    @Override
    public void chooseOption() {
        System.out.println("Выберите черный или голубой");
    }

    @Override
    public void toPay() {
        System.out.println("заказ оплачен картой");
    }

    @Override
    public int promo2Plus1(int count) {
        return 0;
    }

    @Override
    public int discount20(int price) {
        price = (int) (price * 0.8);
        System.out.println("Только сегодня скидка 20%.");
        return price;
    }

    @Override
    public void presentForShip() {

    }

    @Override
    public int buyAddWarranty(WarrantyPeriod dopWarP) {
        System.out.println("Вы покупаете дополнительную гарантию " + dopWarP.getDays() / 365 + " года.");
        return dopWarP.getDays();
    }

    @Override
    public int warrantyFromMaker(WarrantyPeriod warP) {
        System.out.println("Гарантия изготовителя " + warP.getDays() / 365 + " год.");
        return warP.getDays();

    }

    public void totalWarranty(int telWarP, int telDopWarP) {
        System.out.print("Гарантия на телефон составит " + (telWarP + telDopWarP) / 365 + " года. ");
    }
}
