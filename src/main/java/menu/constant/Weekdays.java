package menu.constant;

public enum Weekdays {
    MON("월요일"),
    TUE("화요일"),
    WED("수요일"),
    THU("목요일"),
    FRI("금요일");

    private String day;

    Weekdays(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
