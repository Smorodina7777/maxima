package LessonInterface;

public interface Warranty {
    public int buyAddWarranty(WarrantyPeriod dopWarP);   // Покупка дополниетельной гарантии

    public int warrantyFromMaker(WarrantyPeriod warP);  // Гарантия изготовителя

    public default void issueWarrantyCard() {
        System.out.println("Выдан гарантийный талон.");
    }
}
