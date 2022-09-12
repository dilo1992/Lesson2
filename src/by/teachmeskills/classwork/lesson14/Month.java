package by.teachmeskills.classwork.lesson14;

public enum Month {
    //этот тип класса используется для хранения каких-то постоянных значений (постоянные величины, списки,
    // как месяцы, их всегда 12 и они всегда одинаковые)
    //названия констант пишут большими буквами

    JANUARY(1), FEBRUARY(2), MARCH(3);

    private final int number;

    Month(int number) {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
}
