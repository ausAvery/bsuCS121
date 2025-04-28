public class DayAndTime {
    String day;
    int time;
    String timeOfDay;

    public DayAndTime(String day, int time, String timeOfDay) {
        this.day = day;
        this.time = time;
        this.timeOfDay = timeOfDay;
    }

    void getTimeOfDayInfo() {
        System.out.printf("I want to go see a movie on %s " +
                        "at %d:00 in the %s.\n",
                        day, time, timeOfDay);
    }

}
