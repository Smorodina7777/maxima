package LessonInterface;

public class Shoes extends Product implements Warranty {
    public Shoes(String title, int price, int count) {
        super(title, price, count);
    }

    @Override
    public void chooseOption() {
        System.out.println("Выберите размер");
    }

    @Override
    public void toPay() {
        System.out.println("заказ оплачен переводом");
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

    public void box() {
        System.out.print("Упаковано в коробку. ");


    }
}
