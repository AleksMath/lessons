package Lesson9.Enum;

public class ScoolSchedule {
    private DayOfWeekEnum today;

    public ScoolSchedule(DayOfWeekEnum today) {
        this.today = today;
    }

    public void setToday(DayOfWeekEnum today) {
        this.today = today;
    }

    public DayOfWeekEnum getToday() {
        return today;
    }
}
