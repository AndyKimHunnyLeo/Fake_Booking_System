package user;

import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class User {
    private int user_id;
    private int booking_time = -1;

    public User(int user_id) {
        this.user_id = user_id;
    }

    public User(int user_id, int booking_time) {
        this.user_id = user_id;
        this.booking_time = booking_time;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getBookingTime() {
        return booking_time;
    }

    public void setBookingTime(int booking_time) {
        if(booking_time >24){
            throw new IllegalArgumentException("Booking not available");
        }
        this.booking_time = booking_time;
    }
}
