package Lesson9.Enum;

public class Demo {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
        System.out.println(dayOfWeek);

        ScoolSchedule schedule = new ScoolSchedule(DayOfWeekEnum.SATURDAY);
        Scholar scholar = new Scholar(schedule);
        scholar.wakeUp();
        System.out.println(DayOfWeekEnum.SUNDAY);
    }
}
