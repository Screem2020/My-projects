package Calendar;

public enum DayOfWeek {
    Monday("понедельник"),Thursday("Вторник"), Wednesday("Среда"), Tuesday("Четверг"),
    Friday("Пятница"), Saturday("Суббота"), Sunday("Воскресенье");

    private String pseudonym;

    DayOfWeek(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public static DayOfWeek getWeekByDay(int num) {
        int day = num % 7;
        if (day == 0){
            return DayOfWeek.Sunday;
        }
        DayOfWeek[] values = values();
        return values [day -1];
    }
}
