package Lesson9.Enum;

public enum DayOfWeekEnum {
    SUNDAY("Воскресенье"),
    MONDAY("Поденельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");
    private final String title;

    DayOfWeekEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "title='" + title + '\'' +
                '}';
    }
}
