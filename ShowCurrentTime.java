public class ShowCurrentTime {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 2020
        long totalMilliseconds = System.currentTimeMillis();

        //Obtain the total milliseconds since midnight, Jan 1, 2020
        long totalSeconds = totalMilliseconds /1000;

        // Compute the current second in the minute in the hour
        long currentSeconds = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        System.out.println("Current Time is: " + currentHour + ":" + currentMinute + ":" + currentSeconds + " GMT");



    }
}
