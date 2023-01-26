package LessonInterface;

public class MainStore {
    public static void main(String[] args) {
        Bread tost = new Bread("тостовый хлеб", 40, 2);
        Sausage sausage = new Sausage("фермерская колбаса", 250, 5);
        Telephone iphone = new Telephone("айфон", 35000, 1);
        Shoes sneakers = new Shoes("кроссовки adidas", 7000, 1);
        Wardrobe cupe = new Wardrobe("Шкаф Милан", 20000, 1);


        System.out.println("Вы смотрите " + tost.getTitle() + " за " + tost.getPrice() + " руб " + tost.getCount() + " шт. ");
        tost.expirationDate();
        tost.chooseOption();
        tost.addToCart();
        int delive = tost.delivery(DeliveryOption.PICKUP);
        System.out.println("Стоимость с доставкой составляет " + (tost.cost(tost.getPrice(), tost.getCount(), delive) + " руб. "));
        tost.toPay();
        System.out.println();

        System.out.println("Вы смотрите " + sausage.getTitle() + " за " + sausage.getPrice() + " руб " + sausage.getCount() + " шт. ");
        sausage.orderSlicing();
        sausage.chooseOption();
        sausage.message();
        int promoCount = sausage.promo2Plus1(sausage.getCount());
        sausage.addToCart();
        delive = sausage.delivery(DeliveryOption.BYRUNNER);
        System.out.println("Стоимость с доставкой составляет " + (sausage.cost(sausage.getPrice(), promoCount, delive) + " руб. "));
        sausage.toPay();
        System.out.println();

        System.out.println("Вы смотрите " + iphone.getTitle() + " за " + iphone.getPrice() + " руб " + iphone.getCount() + " шт. ");
        iphone.chooseOption();
        int telWarP = iphone.warrantyFromMaker(WarrantyPeriod.YEAR1);
        int telDopWarP = iphone.buyAddWarranty(WarrantyPeriod.YEAR2);
        iphone.totalWarranty(telWarP, telDopWarP);
        iphone.issueWarrantyCard();
        iphone.message();
        int promoPrice = iphone.discount20(iphone.getPrice());
        iphone.addToCart();
        delive = iphone.delivery(DeliveryOption.TOPOINTOFISSUE);
        System.out.println("Стоимость с доставкой составляет " + (iphone.cost(promoPrice, iphone.getCount(), delive) + " руб. "));
        iphone.toPay();
        System.out.println();

        System.out.println("Вы смотрите " + sneakers.getTitle() + " за " + sneakers.getPrice() + " руб " + sneakers.getCount() + " шт. ");
        sneakers.chooseOption();
        sneakers.warrantyFromMaker(WarrantyPeriod.DAYS30);
        sneakers.issueWarrantyCard();
        sneakers.addToCart();
        sneakers.box();
        delive = sneakers.delivery(DeliveryOption.TOPOINTOFISSUE);
        System.out.println("Стоимость с доставкой составляет " + (sneakers.cost(sneakers.getPrice(), sneakers.getCount(), delive) + " руб. "));
        sneakers.toPay();
        System.out.println();

        System.out.println("Вы смотрите " + cupe.getTitle() + " за " + cupe.getPrice() + " руб " + cupe.getCount() + " шт. ");
        cupe.chooseOption();
        cupe.warrantyFromMaker(WarrantyPeriod.DAYS30);
        cupe.issueWarrantyCard();
        cupe.message();
        cupe.discount20(cupe.getPrice());
        cupe.presentForShip();
        cupe.addToCart();
        cupe.assembly();
        delive = cupe.delivery(DeliveryOption.TOPOINTOFISSUE);
        System.out.println("Стоимость с доставкой составляет " + (cupe.cost(cupe.getPrice(), cupe.getCount(), delive) + " руб. "));
        cupe.toPay();
    }
}
