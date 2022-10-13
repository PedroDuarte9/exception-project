package application;

import model.entities.Reservation;

import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException  {


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



        Scanner sc = new Scanner(System.in);


            System.out.println("Room Number: ");
            int roomNumber = sc.nextInt();

            System.out.println("Check-in Date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());

            System.out.println("Check-out (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);

            if(!checkout.after(checkin)){
                System.out.println("Error in reservation: Check-out date must be after check-in date" );
            }
            else{
                System.out.println("Reservation: " + reservation);
            }

            System.out.println("Enter data to update the reservation");

            System.out.println("Check-in Date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());

            System.out.println("Check-out (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());
            reservation.updateDates(checkin,checkout);
            System.out.println(reservation);











        sc.close();
    }
}
