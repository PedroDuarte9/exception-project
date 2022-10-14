package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args)  {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Room Number: ");
            int roomNumber = sc.nextInt();

            System.out.println("Check-in Date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());

            System.out.println("Check-out (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);

            System.out.println();

            System.out.println("Reservation: " + reservation);

            System.out.println("Enter data to update the reservation");

            System.out.println("Check-in Date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());

            System.out.println("Check-out (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());
            reservation.updateDates(checkin, checkout);
            System.out.println(reservation);


            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation " + reservation);

        }
        catch(ParseException e){
            System.out.println("Invalid date format");
        }
//        catch(DomainException e){
//
//        }
        sc.close();
    }
}
