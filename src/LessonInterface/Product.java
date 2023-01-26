package LessonInterface;

public abstract class Product {
    private String title;
    private int price;
    private int count;

    public Product(String title, int price, int count) {
        this.title = title;
        this.price = price;
        this.count = count;
    }

    public abstract void chooseOption(); // Выбор варианта товара

    public void addToCart() {
        System.out.print("товар добавлен в корзину. ");
    }

    public int delivery(DeliveryOption delivop) {    //Выбор способа доставки
        System.out.println(delivop.getDiscrb() + " за " + delivop.getDelivcost() + " руб.");
        return delivop.getDelivcost();

    }

    public int cost(int price, int count, int deliv) {
        return price * count + deliv;
    }

    public abstract void toPay();

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
