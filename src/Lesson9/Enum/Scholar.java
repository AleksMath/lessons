package Lesson9.Enum;

public class Scholar {
    private ScoolSchedule schedule;

    public Scholar(ScoolSchedule schedule) {
        this.schedule = schedule;
    }

    public void wakeUp() {
        switch (schedule.getToday()) {
            case SATURDAY, SUNDAY -> System.out.println("Иди ты*****");
            default -> System.out.println("Блин снова в школу");
        }
    }

    @Override
    public String toString() {
        return "Scholar{" +
                "schedule=" + schedule +
                '}';
    }
}
