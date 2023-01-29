package LessonInterface;

public class Wardrobe extends Product implements Warranty, Promotion {
    public Wardrobe(String title, int price, int count) {
        super(title, price, count);
    }

    @Override
    public void chooseOption() {
        System.out.println("Выберите бук или черный");
    }

    public void assembly() {
        System.out.println("Заказана сборка мебели");
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
        System.out.print("В этом месяце скидка 20%. ");
        return price;
    }

    @Override
    public void presentForShip() {
        System.out.println("Также в подарок получаете журнальный столик.");
    }

    @Override
    public int buyAddWarranty(WarrantyPeriod dopWarP) {
        return 0;
    }

    @Override
    public int warrantyFromMaker(WarrantyPeriod warP) {
        System.out.print("Гарантия изготовителя " + warP.getDays() + " дней. ");
        return warP.getDays();
    }
}
