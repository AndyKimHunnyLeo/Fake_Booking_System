package supermarket;

import booking.Booking;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Supermarket {
    private List<Booking> bookIngList = new ArrayList<>();

    public Supermarket(){

    }

    public Supermarket(List<Booking> bookIngList) {
        this.bookIngList = bookIngList;
    }

    public List<Booking> getBookIngList() {
        return bookIngList;
    }

    public void setBookIngList(List<Booking> bookIngList) {
        this.bookIngList = bookIngList;
    }

    public void addBookIngList(Booking booking) {
        this.bookIngList.add(booking);
    }


    public int checkWithUserId(int userId) {
        System.out.println("start");
        Booking temp;
        try{
             temp =  this.bookIngList.stream().filter(booking -> booking.getUserId() == userId).findAny().get();

        }catch (Error e){
            throw new IllegalArgumentException("This user doesn't exist");
        }
        System.out.println("User "+userId+"'s booking time is "+temp.getTime());

        return temp.getTime();
    }


    public boolean isBookingSuccessful() {
        return true;
    }


}
