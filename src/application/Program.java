package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        List<Reservation> list = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do quanto: ");
        int roomNumber = sc.nextInt();

        System.out.println("Data de Check-In (DD/MM/AAAA)");
        Date checkin = sdf.parse(sc.next());

        System.out.println("Data de Check-Out (DD/MM/AAAA)");
        Date checkout = sdf.parse(sc.next());
        
        Reservation reservation = new Reservation(roomNumber, checkin,checkout);

        System.out.println(reservation);

        sc.close();
    }
}
