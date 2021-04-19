package booking;

public class Booking {
    private int userId;
    private String day;
    private int time;

    public Booking(int userId, String day, int time) {
        this.userId = userId;
        this.day = day;
        this.time = time;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
