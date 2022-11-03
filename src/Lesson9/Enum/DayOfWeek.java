package Lesson9.Enum;

public class DayOfWeek {
    public static final DayOfWeek SUNDAY = new DayOfWeek("Воскресенье");
    public static final DayOfWeek MONDAY = new DayOfWeek("Понедельник");
    public static final DayOfWeek TUESDAY = new DayOfWeek("Вторник");
    public static final DayOfWeek WEDNESDAY = new DayOfWeek("Среда");
    public static final DayOfWeek THURSDAY = new DayOfWeek("Четверг");
    public static final DayOfWeek FRIDAY = new DayOfWeek("Пятница");
    public static final DayOfWeek SATURDAY = new DayOfWeek("Суббота");





    private String title;

    private DayOfWeek(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}
