import booking.Booking;
import supermarket.Supermarket;
import user.User;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User(1);
        Booking booking1 = new Booking(213, "Mon", 12);
        Booking booking2 = new Booking(543, "Tue", 12);
        Booking booking3 = new Booking(61, "Wed", 12);
        Booking booking4 = new Booking(1, "Fri", 12);
        Booking booking5 = new Booking(72, "Sat", 12);

        Supermarket supermarket = new Supermarket();
        supermarket.addBookIngList(booking1);
        supermarket.addBookIngList(booking2);
        supermarket.addBookIngList(booking3);
        supermarket.addBookIngList(booking4);
        supermarket.addBookIngList(booking5);
        boolean error = true;
        int repeatAgain = 0;
        while (repeatAgain == 0) {
            while (error) {
                error = false;
                System.out.println("Hi New World!");
                System.out.println("Press 1 if you want to see the booking for a user");
                System.out.println("Press 2 to report all booked time slots");
                Scanner userInput = new Scanner(System.in);
                int options = userInput.nextInt();
                switch (options) {
                    case 1:
                        checkAUserBooking(supermarket);
                        break;
                    case 2:
                        reportAllBooking(supermarket);
                        break;
                    default:
                        error = true;
                        break;
                }
            }
            System.out.println("Do you want to repeat? 0 = yes and 1 = no");
            Scanner repeat = new Scanner(System.in);
            repeatAgain = repeat.nextInt();


        }

    }

    public static void checkAUserBooking(Supermarket supermarket) {
        System.out.println("Enter the user ID");
        Scanner userInput = new Scanner(System.in);
        int userId = userInput.nextInt();
        supermarket.checkWithUserId(userId);
    }

    public static void reportAllBooking(Supermarket supermarket){
        supermarket.getBookIngList().forEach(booking -> System.out.println(booking.getUserId()+" booked "+booking.getDay().toUpperCase(Locale.ROOT)+" at "+ booking.getTime()));
//        System.out.println(supermarket.getBookIngList());
    }
}
