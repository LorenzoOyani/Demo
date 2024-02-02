package Handle_Strings.java;

public class TimeStrings {
    private long hour;
    private long minute;
    private long seconds;
    TimeStrings(long elapseTime) {
        setTime(elapseTime);
    }
    TimeStrings(){
        this(0);
    }
    TimeStrings(long hour, long minute, long seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public long getHour(){
        return hour;
    }
    public  long getMinute(){
        return minute;
    }
    public long getSeconds(){
        return seconds;
    }

    public void setTime(long elapseTime) {
        long totalMiliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMiliSeconds / 1000;
        seconds = totalSeconds % 60;
        long totalMinute =seconds / 60;
        minute =totalMinute % 60;
        long totalHours = totalMinute / 60;
        hour = totalHours % 24;

        if(elapseTime > 0) {
            totalSeconds = elapseTime / 1000;
            seconds = totalSeconds % 60;
            totalMinute = seconds / 60;
            minute = totalMinute % 60;
            totalHours = minute / 60;
            hour  = totalHours % 24;

        }

    }
}