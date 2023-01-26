package LessonInterface;

public enum DeliveryOption {
    //Здесь указаны варианты доставки.
    BYRUNNER("Выбрана доставка курьером", 400),
    PICKUP("Выбран самовывоз", 0),
    TOPOINTOFISSUE("Выбрана доставка в пункт выдачи", 150);
    private String discrb;
    private int delivcost;

    DeliveryOption(String discrb, int delivcost) {
        this.discrb = discrb;
        this.delivcost = delivcost;
    }

    public String getDiscrb() {
        return discrb;
    }

    public int getDelivcost() {
        return delivcost;
    }
}
