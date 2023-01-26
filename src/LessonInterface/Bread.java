package LessonInterface;

public class Bread extends Product{
    public Bread(String title, int price, int count) {
        super(title, price, count);
    }

    @Override
    public void chooseOption() {
        System.out.println("Выберите пшеничный или ржаной");
    }
    @Override
    public void toPay() {
        System.out.println("заказ оплачен бонусами");
    }
    public void expirationDate(){
        System.out.print("Проверено: выпечен не раньше 3х дней. ");
    }


}
