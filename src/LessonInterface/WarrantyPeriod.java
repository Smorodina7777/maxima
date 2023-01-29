package LessonInterface;

public enum WarrantyPeriod {
    // Здесь указаны гарантийные сроки
    YEAR1("гарантия 1 год", 365),
    YEAR2("гарантия 2 года", 730),
    DAYS30("гарантия 30 дней", 30);
    private String s;
    private int days;

    WarrantyPeriod(String s, int days) {
        this.s = s;
        this.days = days;
    }

    public String getS() {
        return s;
    }

    public int getDays() {
        return days;
    }
}
